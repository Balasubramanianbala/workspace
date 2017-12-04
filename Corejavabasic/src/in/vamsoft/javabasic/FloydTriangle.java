package in.vamsoft.javabasic;

import java.util.Scanner;

public class FloydTriangle {

     public static void main(String args[])
     {
        int n, num = 0, i, j;
        Scanner scan = new Scanner(System.in);
   
        System.out.println("Enter the number of rows of floyd's triangle you want");
        n = scan.nextInt();
   
        System.out.println("Floyd's triangle :-");
   
        for ( i = 1 ; i <= n ; i++ )
        {
          ++num;
           for ( j = 1 ; j <= i ; j++ )
           {
              System.out.print(num+" ");
              //num++;
           }
   
           System.out.println();
        }
     }
  }



