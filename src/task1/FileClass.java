package task1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import static java.nio.charset.StandardCharsets.UTF_8;


public class FileClass {
    public static void main(String[] args)  throws IOException {
        Path testFilePath = Paths.get("C:/Users/maryna.zhulai/java/File1.txt");

        System.out.println(Files.exists(Paths.get("C:/Users/maryna.zhulai/java/File1.txt")));



        List<String> lines = Files.readAllLines(Paths.get("C:/Users/maryna.zhulai/java/File1.txt"), UTF_8);
        for (String s: lines) {
            System.out.println(s);
        }

        System.out.println("--------------");

        try {
            Files.write(Paths.get("C:/Users/maryna.zhulai/java/File2.txt"), lines, UTF_8);
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        List<String> lines2 = Files.readAllLines(Paths.get("C:/Users/maryna.zhulai/java/File2.txt"), UTF_8);
        for (String s: lines2) {
            System.out.println(s);
        }



       try {
            Files.delete(testFilePath);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Files.exists(Paths.get("C:/Users/maryna.zhulai/java/File1.txt")));

    }
}
