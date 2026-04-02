import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerLexico {

    public static void main(String[] args) {
        String caminhoEntrada = "livro.txt";
        String caminhoSaida = "tokens_saida_java.txt";

        try {
            // 1. Lê todo o conteúdo do arquivo txt em UTF-8
            String texto = new String(Files.readAllBytes(Paths.get(caminhoEntrada)), StandardCharsets.UTF_8);

            // 2. Definição da Expressão Regular (RegEx):
            // \\p{L}+           -> Captura uma ou mais letras (inclui acentos do português).
            // (?:-\\p{L}+)* -> Permite hifens seguidos de mais letras (ex: "sentou-se").
            // |                 -> Operador OU.
            // [^\\p{L}\\p{N}\\s]-> Captura o que NÃO for letra, NÃO for número e NÃO for espaço (pontuações).
            String regex = "\\p{L}+(?:-\\p{L}+)*|[^\\p{L}\\p{N}\\s]";
            
            Pattern padrao = Pattern.compile(regex);
            Matcher combinador = padrao.matcher(texto);

            // 3. Estrutura para armazenar o vetor de tokens
            List<String> tokens = new ArrayList<>();

            // 4. Itera sobre o texto encontrando os tokens
            while (combinador.find()) {
                tokens.add(combinador.group());
            }

            // 5. Salva o resultado no arquivo de saída
            Files.write(Paths.get(caminhoSaida), tokens, StandardCharsets.UTF_8);

            System.out.println("Sucesso! " + tokens.size() + " tokens encontrados.");
            
            // Imprime os primeiros 20 tokens como demonstração
            System.out.println("Os primeiros 20 tokens são: ");
            System.out.println(tokens.subList(0, Math.min(20, tokens.size())));

        } catch (IOException e) {
            System.err.println("Erro ao ler ou gravar os arquivos: " + e.getMessage());
        }
    }
}