package in.vamsoft.training.trainer;

public class MainThread {

  public static void main(String[] args) throws InterruptedException {
    
  
  
    ThreadExtensionThread t1=new ThreadExtensionThread();
    //ThreadExtensionThread t1=new ThreadExtensionThread();
    t1.setName("A");
    t1.start();
    try {
      t1.sleep(2000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    //ThreadExtensionThread t2=new ThreadExtensionThread();
    RunnableThread r=new RunnableThread();
    Thread t2=new Thread(r);
    t2.setName("B");
    t2.start();
    t1.join();
    
    t2.join(2000);
    t1.setPriority(10);
    System.out.println("thread is finished");
    
  }
}
