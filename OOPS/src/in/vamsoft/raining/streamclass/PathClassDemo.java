package in.vamsoft.raining.streamclass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathClassDemo {

  public static void main(String[] args) {
    Path p = Paths.get("/home/vamsoft/actor.txt");
    Path p1 = Paths.get("/home/vamsoft/actor.txt");
    System.out.println("Paths Equal:" + p.equals(p1));
    System.out.println("Excuting path methods");
    System.out.println("File name:" + p.getFileName());
    System.out.println("File System:" + p.getFileSystem());
    System.out.println("Parent:" + p.getParent());
    System.out.println("name count" + p.getNameCount());
    System.out.println("Root" + p.getRoot());
    System.out.println("the name at subscript" + p.getName(1));
    System.out.println("finished executting path methods");

    Path destPath = Paths.get("/home/vamsoft/Desktop/misc/actor.txt");
    try {
      Files.copy(p,destPath, StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
      System.out.println("file copied");      
    }catch(IOException e) {
      e.printStackTrace();
    }
  }

}
