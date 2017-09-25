package in.vamsoft.training.exampleenum;

import java.time.Month;
import java.util.Scanner;

public class MonthEn {

  public static void main(String[] args) {
    for (Month m : Month.values()) {
      System.out.println(m);
    }
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter the day of number");
    n = sc.nextInt();
    Day d1;
    d1 = Day.WEDNESDAY;
    switch (n) {
    case 1:
      System.out.println(d1.MONDAY);
      break;
    case 2:
      System.out.println(d1.TUESDAY);
      break;
    case 3:
      System.out.println(d1.WEDNESDAY);
      break;
    case 4:
      System.out.println(d1.THURSDAY);
      break;
    case 5:
      System.out.println(d1.FRIDAY);
      break;
    case 6:
      System.out.println(d1.SATURDAY);
      break;
    case 7:
      System.out.println(d1.SUNDAY);
      break;
    default:
      System.out.println("unknown number of day");

    }

  }

}
