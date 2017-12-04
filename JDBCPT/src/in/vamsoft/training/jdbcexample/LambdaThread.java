package in.vamsoft.training.jdbcexample;

public class LambdaThread extends Thread{
  public static void main(String[] args) {
    
  
  Thread t1=new Thread(()->{for(int i=1;i<=10;i++)
                              System.out.println("hello");});
  t1.start();
  }
}
