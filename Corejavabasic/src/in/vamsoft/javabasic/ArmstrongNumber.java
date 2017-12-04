package in.vamsoft.javabasic;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {

    int s = 0, n, n1, r;
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number");
    n = scanner.nextInt();
    n1 = n;
    while (n > 0) {

      r = n % 10;
      s = s + r * r * r;
      n = n / 10;
    }
    if (s == n1) {
      System.out.println("The Armstrong number is =" + s);
    } else {
      System.out.println("the number is not a armstrong" + s);
    }
    scanner.close();
  }

}
