package in.vamsoft.training.trainer;

public class ThreadExtensionThread extends Thread {

     @Override
  public void run() {
    
    int x=-1,x1=1,x2;
     
    for (int i = 1; i <= 10; i++) {
      
      x2=x+x1;
      x=x1;
      x1=x2;
      System.out.println(x2);
    }
  }

}
