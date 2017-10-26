package in.vamsoft.kathy.chpt6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDog {

  /**
   * .
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * @param args.
   */
  public static void main(String[] args) {
    Collar c = new Collar(3);
    Dog d = new Dog(c, 8);
    System.out.println("before Collarsize" + d.getcollar().getCollarSize());
    try {
      FileOutputStream fs = new FileOutputStream("testSer.txt");
      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(d);
      os.close();
      System.out.println("Serialized");
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("after Collarsize" + d.getcollar().getCollarSize());
  }

}
