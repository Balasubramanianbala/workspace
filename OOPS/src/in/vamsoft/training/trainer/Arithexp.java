package in.vamsoft.training.trainer;

import java.util.Scanner;

public class Arithexp {

  /**
   * @param args.
   */
  public static void main(String[] args) {

    try {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the A and B number");
      int n = scan.nextInt();
      int n1 = scan.nextInt();
      int result = n / n1;
      System.out.println("the quotient" + result);
      scan.close();
    } catch (ArithmeticException ae) {
      System.out.println("Not Divisble by zero" + ae.getMessage());
    }
  }

}
