package in.vamsoft.kathy.chpt7;

public class Bob {

  int shoeSize;
  String nickName;

  Bob(String nickName, int shoeSize) {
    this.nickName = nickName;
    this.shoeSize = shoeSize;
  }

  public String toString() {

    return ("I am Bob but you can call me" + nickName + "My shoeSize is" + shoeSize);
  }
}