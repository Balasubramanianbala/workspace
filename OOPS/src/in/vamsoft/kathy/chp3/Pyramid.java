package in.vamsoft.kathy.chp3;

import java.util.Scanner;

public class Pyramid {

  public static void main(String[] args) {

    int i, j, n, m;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the n value");
    n = sc.nextInt();
    m = n;
    for (i = 1; i <= n; i++) {

      for (j = 0; j < m; j++) {
        System.out.print("");
      }
      m--;
      for (j = 1; i <= 2 * i - 1; i++) {
        System.out.print("*");
      }
      System.out.println();

    }

  }

}
