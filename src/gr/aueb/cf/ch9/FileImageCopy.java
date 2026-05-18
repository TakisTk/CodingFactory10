package gr.aueb.cf.ch9;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileImageCopy {

    public static void main(String[] args) {
        Path source = Path.of("");
        Path target = Path.of("");
    }

    public static void copyImage(Path sourcePath, Path destPath){
        try(var sourceStream =Files.newInputStream(sourcePath);
            var targetStream = Files.newOutputStream(destPath)) {
            sourceStream.transferTo(targetStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
