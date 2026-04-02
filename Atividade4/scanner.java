import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class ExtrairEmails {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.ime.usp.br");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            StringBuilder conteudo = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha);
            }

            reader.close();

            // Regex de email
            Pattern pattern = Pattern.compile(
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"
            );

            Matcher matcher = pattern.matcher(conteudo.toString());

            List<String> emails = new ArrayList<>();

            while (matcher.find()) {
                emails.add(matcher.group());
            }

            System.out.println(emails);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}