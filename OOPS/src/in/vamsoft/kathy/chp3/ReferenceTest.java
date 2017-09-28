package in.vamsoft.kathy.chp3;

import java.awt.Dimension;

public class ReferenceTest {

  /**
   * .
   * 
   * @param args.
   */
  public static void main(String[] args) {

    Dimension a = new Dimension(5, 10);
    System.out.println("a=" + a.height);
    Dimension b = a;
    b.height = 30;
    System.out.println("a=" + a.height + "after b changed");
    Integer i = new Integer(50);//wrap
    int j = i.intValue();//unwrap
    j++;
    i = new Integer(j);
    System.out.println("j=" + j);

  }

}
