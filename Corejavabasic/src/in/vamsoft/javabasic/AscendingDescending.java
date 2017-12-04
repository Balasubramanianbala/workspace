package in.vamsoft.javabasic;

import java.util.Scanner;

public class AscendingDescending {

  public static void main(String[] args) {

    int i, j, n, t ;
    int[] a = new int[10];
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the element");
    n = scanner.nextInt();
    System.out.println("Enter the array element");
    for (i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    for (i = 0; i < n; i++) {
      for (j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          t = a[i];
          a[i] = a[j];
          a[j]= t;
        }
      }
    }
    for (i = 0; i < n; i++) {
      System.out.println("Ascending order" + a[i]);
    }
    for (i = n-1; i >= 0; i--) {
      System.out.println("descending order" + a[i]);
    }
  }

}
