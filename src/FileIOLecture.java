import java.io.IOException;
import java.nio.file.*;

public class FileIOLecture {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

        Path path = Paths.get("src", "FileIOLecture.java");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path toOurDataPlace = Paths.get("src/data");
//        Path toAnotherProjectsData = Paths.get()
        System.out.println(toOurDataPlace);

        try {
            if (Files.notExists(toAnotherProjectsData)) {
                Files.creaatedDirectories(toOurDataPlace);
            } else {
                System.out.println("The " + toOurDataPlace + " directory already exists.");
            }
        } catch (IDException ioe){
            ioe.printStackTrace();
        }



    }
}
