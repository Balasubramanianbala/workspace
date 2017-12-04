package in.vamsoft.raining.streamclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filesound {
  
  public static void main(String[] args) {
    
    String str;
    String str1;
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the sourse and destination");
    str=scanner.next();
    str1=scanner.next();
    try(FileInputStream fin=new FileInputStream(str); FileOutputStream fout=new FileOutputStream(str1);)
        {
      int c=0;
      while((c=fin.read())!=-1) {
        fout
        .write(c);
      }
      
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
