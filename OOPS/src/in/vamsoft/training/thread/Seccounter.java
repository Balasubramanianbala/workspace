package in.vamsoft.training.thread;

public class Seccounter extends Thread{
   
  public void run() {
    for(int i=10;i<=1000;i+=10) {
      System.out.println(i);  
    }
  }

}
