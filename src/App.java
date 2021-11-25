import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        String html1 = "<!DOCTYPE html><html><body><p>";
        String html2 = "<p/></body></html>";
        String everything = "";

        // Load and read text file
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\steve\\OneDrive\\Desktop" +
                "\\james-joyce-the-dead-paragraph.txt"))) {
            StringBuilder sb1 = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb1.append(line);
                sb1.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb1.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }


        // Create new .html file and write to it
        FileWriter myWriter = new FileWriter("james-joyce-the-dead-paragraph.html");
        myWriter.write(html1 + everything + html2);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

    }
}



