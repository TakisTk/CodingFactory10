package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFiles2App {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("C:/Users/Takis/test.txt");
        List<String> lines = Files.readAllLines(filePath);

        for (String line : lines) {
            String[] tokens = line.split(" ");
            String firstname = tokens[0];
            String lastname = tokens[1];
            System.out.println(lastname + ", " + firstname);
        }
    }
}
