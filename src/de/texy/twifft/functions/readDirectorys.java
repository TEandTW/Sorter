package de.texy.twifft.functions;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class readDirectorys{

    public readDirectorys() {
        listFile();
        destroyFile();
    }
    public static Path path;
    public static void listFile() {

        path = Paths.get("C:\\Users\\schin\\Downloads\\ganache");




       try (Stream<Path> subPath = Files.walk(path)){


            String prefix = "test";
            String suffix = ".txt";

            File file = new File(path + "\\" + prefix, suffix);
            String d = path.toString();

         //   Files.createTempFile(path, suffix, prefix);
           subPath.forEach(System.out::println);
        } catch (IOException e) {
           e.printStackTrace();
       }
    }
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



}
