package in.vamsoft.kathy.chp3;

public class Layout {
  
  int x=6;
  public static void main(String args[]) {
    
        Layout l=new Layout();
        l.go();
    
    
  }
  void go(){
    int y=5;
    go2();
    y++;
  }
  void go2()
  {
    int y=x++;
  }


}
