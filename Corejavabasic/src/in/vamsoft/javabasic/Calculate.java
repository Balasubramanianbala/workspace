package in.vamsoft.javabasic;

import java.util.Scanner;

public class Calculate {
  public static void main(String argu[]) {
    double pr, rate, t;
    Scanner sc = new Scanner(System.in);
    calc c=new calc();
    System.out.println("Enter the amount:");
    pr = sc.nextDouble();
    System.out.println("Enter the No.of years:");
    t = sc.nextDouble();
    System.out.println("Enter the Rate of  interest");
    rate = sc.nextDouble();
    System.out.println("enter the n value");;
    int n=sc.nextInt();
    System.out.println("Simple Interest=" + c.SimpleInterest(pr, t, rate));
    System.out.println("Compound Interest=" + c.CompoundInterest(pr, t, rate));
    System.out.println("square root value"+c.Squareroot(pr));
    System.out.println("the factorial number is "+c.fact(n));
  }
}

 class calc {

  public double SimpleInterest(double p, double n, double r) {

    return (p * r * n) / 100;

  }

  public double CompoundInterest(double p, double n, double r) {

    return p * Math.pow(1.0 + r / 100.0, n) - p;

  }
  public double Squareroot(double p) {
    
    return Math.sqrt(p);
  }
  static int fact(int no) {
    int f = 1;
    for (int j = no; j > 1; j--)
      f = f * j;
    return f;
  }

}
