package in.vamsoft.training.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



class FiletextThread extends Thread{
  NumberThread nt;
  
  int tall;
  public FiletextThread(String  name) {
    super(name);
    //this.nt = nt;
  }
  
  public void setNt(NumberThread nt) {
    this.nt = nt;
  }
 public void run() {
   try {
     
     Scanner scanner = new Scanner(new File("src/text.txt"));
             
     
      while(scanner.hasNextInt())
     {
          tall = scanner.nextInt();
          synchronized (nt) {
            nt.notify();
          }synchronized (this) {
            wait();
            
          }
            
          }
     }
     catch (InterruptedException e) {

     System.out.println("e");
   } catch (IOException e) {
    
    e.printStackTrace();
  }
 }
public int getTall() {
  return tall;
}
  
  
}
class NumberThread extends Thread{
   FiletextThread ft;
   public NumberThread(String name) {   
     super(name);

   }

   

   public void setFt(FiletextThread ft) {
    this.ft = ft;
  }



  public void run() {
     for (int i = 0; i <= 5; i++) {
       try {
         synchronized (this) {
           wait();
         }

       } catch (InterruptedException e) {
         System.out.println(e);
       }
      // File f=ft.getF();
       int fact = factorial(ft.getTall());
       System.out.println("Factorial calculated for" + ft.getTall() + ":" + fact);
       synchronized (ft) {
         ft.notify();

       }
     }
   }

   private int factorial(int num) {
     int f = 1;
     while (num > 0) {
       f = f * num;
       num--;
     }
     return f;
   }
}
public class Filethread {
  
  public static void main(String[] args) {
    
    FiletextThread ft=new FiletextThread("filetext");
    NumberThread nt=new NumberThread("number thread");
    ft.setNt(nt);
    nt.setFt(ft);
    ft.start();
    nt.start();
  }
  

}
