package de.texy.twifft.functions;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class readDirectorys{

    public readDirectorys() {
        listFile();
        createFolders();
      //  destroyFile();
    }
    public static Path path;
    public static void listFile() {
        String home = System.getProperty("user.home");
        path = Paths.get(home + "\\Downloads");


        /*

       try (Stream<Path> subPath = Files.walk(path)){


            String prefix = "test";
            String suffix = ".txt";

          //  File file = new File(path + "\\" + prefix, suffix);
            String d = path.toString();

         //   Files.createTempFile(path, suffix, prefix);
           subPath.forEach(System.out::println);
        } catch (IOException e) {
           e.printStackTrace();
       }
       */
    }

    public static void createFolders() {


        try (Stream<Path> subPath = Files.walk(path)){

            Path pathFile = Files.createTempFile(path, "ahlka", ".tmp");

            Files.write(pathFile, "dick is big".getBytes(StandardCharsets.UTF_8));

            String tmpContent = Files.lines(pathFile, StandardCharsets.UTF_8)
                            .collect(Collectors.joining(System.lineSeparator()));

            System.out.println(tmpContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public static void destroyFile() {
        if(clickFunctions.aboutToExit) {

            String filenames;
            Integer fileCount;

            fileCount = path.getNameCount();
            filenames = path.getFileName().toString();
                try(Stream<Path> subPath = Files.walk(path)) {
                    Files.deleteIfExists(path.getFileName());


                    subPath.forEach(System.out::println);
                }catch (IOException e) {
                    e.printStackTrace();
                }



        }
    }
*/


}
