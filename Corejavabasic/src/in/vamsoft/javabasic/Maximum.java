package in.vamsoft.javabasic;

import java.util.Scanner;

public class Maximum {

  public static void main(String[] args) {

    int i, n, max = 0;
    int[] a = new int[10];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the n value");
    n = scanner.nextInt();
    System.out.println("Enter the array element");
    for (i = 0; i < n; i++) {
      a[i] += scanner.nextInt();
    }
    for (i = 0; i < n; i++) {
      if (max < a[i]) {
        max = a[i];
      }
    }
    System.out.println("The maximum number is=" + max);
    scanner.close();

  }

}
