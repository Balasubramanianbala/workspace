package in.vamsoft.kathy.chpt6;

import java.beans.Transient;
import java.io.Serializable;

public class Dog implements Serializable {

  transient private Collar theCollar;
  private int dogSize;

  public Dog(Collar co, int size) {
    theCollar = co;
    dogSize = size;
  }

  public Collar getcollar() {
    return theCollar;
  }

}
