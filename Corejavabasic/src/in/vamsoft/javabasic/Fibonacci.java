package in.vamsoft.javabasic;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {

    int x = 0, x1 = 1, x2, n, i;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of terms");
    n = scanner.nextInt();
    for (i = 0; i < n; i++) {
      x2 = x1 + x;
      x = x1;
      x1 = x2;
      System.out.println(x2);
    }
    scanner.close();        
  }

}
