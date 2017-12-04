package in.vamsoft.raining.streamclass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MarkDemo {

  public static void main(String[] args) throws Exception{
    
    try(InputStream is=new BufferedInputStream(new FileInputStream("myfile.txt"),1);){
      System.out.println("Charactered printed");
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      is.mark(15);
      System.out.println("mark() invoked");
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      System.out.println((char)is.read());
      if(is.markSupported()) {
        is.reset();
        System.out.println("reset() invoked");
        System.out.println((char)is.read());
        System.out.println((char)is.read());
      }else {
        System.out.println("InputStream doesnot supported");
      }
    }catch (Exception e) {
        e.printStackTrace();
    }  
    
  }
  
}
