package in.vamsoft.training.thread;

public class Mainthread {
  public static void main(String[] args) {
   
    Fstcounter fstcounter=new Fstcounter();
    Seccounter seccounter=new Seccounter();
    Thirdcounter thirdcounter= new Thirdcounter();
    fstcounter.start();
    seccounter.start();
    thirdcounter.start();
  }

}
