import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // reads text from text file at given URL.
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\steve\\OneDrive - MMU\\Desktop" +
                "\\testTestTest" +
                ".txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();


            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();


            }
            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

