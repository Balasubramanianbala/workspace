package in.vamsoft.raining.streamclass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class FileAttributes {
  
  public static void main(String[] args) throws Exception{
    
    Path file=Paths.get("/home/vamsoft/actor.txt");
    BasicFileAttributes attr= Files.readAttributes(file, BasicFileAttributes.class);
    System.out.println("CreationTime:"+attr.creationTime());
    System.out.println("lastaccesstime:"+attr.lastAccessTime());
    System.out.println("lastModified time:"+attr.lastModifiedTime());
    System.out.println("isDirectory:"+attr.isDirectory());
    System.out.println("isother:"+attr.isOther());
    System.out.println("isregularfile"+attr.isRegularFile());
    System.out.println("isSymboliclink:"+attr.isSymbolicLink());
    
    DosFileAttributes at=Files.readAttributes(file, DosFileAttributes.class);
    System.out.println("is readOnly:"+at.isReadOnly());
    System.out.println("ishidden:"+at.isHidden());
    System.out.println("isArchieve"+at.isArchive());
    System.out.println("is system is"+at.isSystem());
    
  }

}
