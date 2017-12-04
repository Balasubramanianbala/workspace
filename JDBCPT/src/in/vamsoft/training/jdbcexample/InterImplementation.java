package in.vamsoft.training.jdbcexample;

interface i1{
  public default void m() {
    System.out.println("m in i1");
  }
}
interface i2{
  public default void m() {
    System.out.println("m in i2");
  }
}
class Implementation implements i1,i2{

  @Override
  public void m() {
    // TODO Auto-generated method stub
    i1.super.m();
  }
  
}
public  class InterImplementation {

  public static void main(String[] args) {
    
    Implementation im=new Implementation();
    im.m();
  }
  
}
