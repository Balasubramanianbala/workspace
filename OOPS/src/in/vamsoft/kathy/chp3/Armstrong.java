package in.vamsoft.kathy.chp3;

import java.util.Scanner;

public class Armstrong {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n, n1, r, s = 0;
    System.out.println("Enter the n value");
    n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      n1 = i;
      while (n1 > 0) {
        r = n1 % 10;
        s = s + (r * r * r);
        n1 = n1 / 10;

      }
      if (i == s) {
        System.out.println(s);
      }
      s = 0;
    }

  }

}