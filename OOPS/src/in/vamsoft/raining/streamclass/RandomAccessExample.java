package in.vamsoft.raining.streamclass;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessExample {
  public static void main(String[] args)throws Exception {
    try {
      RandomAccessFile accessFile=new RandomAccessFile("myfile.txt", "rw");
      accessFile.write("hello how are you".getBytes());
      accessFile.seek(5);
      int c;
      while((c=accessFile.read())!=-1) {
        System.out.println((char)c);        
      }
      accessFile.seek(accessFile.length());
      accessFile.write("appending to file".getBytes());
      System.out.println();
      accessFile.seek(0);
      while((c=accessFile.read())!=-1) {
        System.out.println((char)c);
      }
    }catch (FileNotFoundException e) {
      // TODO: handle exception
    }    
  }

}
