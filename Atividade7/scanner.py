import re
import json

def tokenizar_texto(caminho_entrada, caminho_saida):
    """
    Lê um arquivo de texto, realiza a análise léxica (tokenização) 
    usando expressões regulares e salva o resultado em um arquivo JSON.
    """
    try:
        # Abre o arquivo do livro com codificação UTF-8
        with open(caminho_entrada, 'r', encoding='utf-8') as arquivo:
            texto = arquivo.read()

        # Definição da Expressão Regular (RegEx):
        # \w+(?:-\w+)* -> Captura palavras inteiras. O (?:-\w+)* permite capturar 
        #                  palavras compostas ou com ênclise (ex: "Comprimentou-me").
        # |             -> Operador OU.
        # [^\w\s]       -> Captura qualquer caractere que NÃO seja alfanumérico (\w) 
        #                  e NÃO seja espaço em branco (\s). Captura as pontuações.
        padrao_regex = re.compile(r'\w+(?:-\w+)*|[^\w\s]')

        # O método findall retorna uma lista de todas as ocorrências que batem com o padrão
        tokens = padrao_regex.findall(texto)

        # Salva o vetor (lista) de tokens em um arquivo de saída formatado
        with open(caminho_saida, 'w', encoding='utf-8') as arquivo_saida:
            json.dump(tokens, arquivo_saida, ensure_ascii=False, indent=4)

        print(f"Sucesso! {len(tokens)} tokens encontrados.")
        print(f"Os primeiros 20 tokens são: {tokens[:20]}")

    except FileNotFoundError:
        print(f"Erro: O arquivo '{caminho_entrada}' não foi encontrado.")

if __name__ == "__main__":
    # Nomes dos arquivos de entrada e saída
    ARQUIVO_LIVRO = 'livro.txt'
    ARQUIVO_TOKENS = 'tokens_saida.json'
    
    tokenizar_texto(ARQUIVO_LIVRO, ARQUIVO_TOKENS)