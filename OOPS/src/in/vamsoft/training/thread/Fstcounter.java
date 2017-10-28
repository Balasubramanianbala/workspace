package in.vamsoft.training.thread;

public class Fstcounter extends Thread {
  
  public void run() {
    
    for(int i=5;i<=1000;i+=5) {
      System.out.println(i);
    }
    
  }
  
}
