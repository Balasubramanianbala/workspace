package in.vamsoft.training.exampleenum;

import java.util.Scanner;

/**
 * This class contains details about Vehicle. Vehicle class as abstract and
 * implements Driving interface.
 * 
 * @author vamsoft.
 * @since 19/09/2017.
 */

public class Monthif {

  public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("enter the n month");
    n = in.nextInt();
    if (n == 1) {
      System.out.println(" January");
    } else if (n == 2) {
      System.out.println(" February");
    } else if (n == 3) {
      System.out.println(" March");
    } else if (n == 4) {
      System.out.println(" April");
    } else if (n == 5) {
      System.out.println(" May");
    } else if (n == 6) {
      System.out.println(" June");
    } else if (n == 7) {
      System.out.println(" July");
    } else if (n == 8) {
      System.out.println(" August");
    } else if (n == 9) {
      System.out.println(" September");
    } else if (n == 10) {
      System.out.println(" October");
    } else if (n == 11) {
      System.out.println(" November");
    } else if (n == 12) {
      System.out.println(" December");
    } else {
      System.out.println("this is unknown no of month");
    }
  }

}
