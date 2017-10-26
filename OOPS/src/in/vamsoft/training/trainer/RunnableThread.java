package in.vamsoft.training.trainer;

public class RunnableThread implements Runnable{

  @Override
  public void run() {
    int f=1;
    for (int i=1;i<=5;i++) {
     f=f*i;
    }
    System.out.println("factorial 5 is"+f);
  }

}
