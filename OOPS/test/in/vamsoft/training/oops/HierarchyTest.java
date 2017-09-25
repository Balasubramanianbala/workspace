package in.vamsoft.training.oops;

/*
 *  * @author vamsoft
 *
 */
public class HierarchyTest {
  /**
   * @vechile, car, sportscar main class .
   */
  public static void main(String[] args) {

    // SportsCar car = new SportsCar("suv");
    // Vehicle v=new SportsCar();
    SportsCar sp = new SportsCar();
    sp.handBrake();
    sp.fourWheelDrive();
    // v.start();
    System.out.println(sp.toString());

  }

}
