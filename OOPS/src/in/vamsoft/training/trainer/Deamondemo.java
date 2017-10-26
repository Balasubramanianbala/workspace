package in.vamsoft.training.trainer;

class threaddemo extends Thread {

  @Override
  public void run() {

    int x = -1, x1 = 1, x2;

    for (int i = 1; i <= 10; i++) {

      x2 = x + x1;
      x = x1;
      x1 = x2;
      System.out.println(x2);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

public class Deamondemo extends Thread {

  public void run() {
    for (int i = 0; i < 1000; i++) {
      
        System.out.println(i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }

  public static void main(String[] args) {

    threaddemo th = new threaddemo();
    Deamondemo de = new Deamondemo();
    de.setDaemon(true);
    th.start();
    de.start();
    
    System.out.println("thread finished");

  }

}
