package in.vamsoft.javabasic;

import java.util.Scanner;

public class Primeno {
  public static void main(String[] args) {
    
    int n,i,flag=0;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number");
    n=scan.nextInt();
    for(i=1;i<n/2;i++) {
      if(i%2==0) {
        flag=0;
      }
      else {
          flag=1;
      }
    }
    if(flag==1) {
    System.out.println("the number is prime number");
    }else {
      System.out.println("the number is not prime number");
    }
    scan.close();
  }

}
