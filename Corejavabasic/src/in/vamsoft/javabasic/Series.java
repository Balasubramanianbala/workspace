package in.vamsoft.javabasic;

import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Series {
  public static void main(String ar[]) throws IOException {
    int i;
    double x, n , sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the value of x:");
    x = scan.nextDouble();
    System.out.println("Enter the value of n:");
    n = scan.nextDouble();
    for (i = 1; i <= n; i++) {
      sum = sum + Math.pow(x, i) / fact(i);
    }
    System.out.println("Answer is:" + (1+sum));
  }

  static int fact(int no) {
    int f = 1;
    for (int j = no; j > 1; j--)
      f = f * j;
    return f;
  }
}
