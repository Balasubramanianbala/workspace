package in.vamsoft.training.thread;

public class Thirdcounter extends Thread{
  public void run() {
    for(int i=100;i<=1000;i+=100) {
      System.out.println(i);
    }

  }

}
