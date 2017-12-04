package in.vamsoft.javabasic;

import java.util.Scanner;

public class MultiplyMatrix {

  public static void main(String[] args) {
    
      int i,j,k,m,n,l;
      Scanner input=new Scanner(System.in);     
      int [][] a=new int[10][10];
      int [][] b=new int[10][10];
      int [][] c=new int[10][10];
      System.out.println("enter the m value");
      m=input.nextInt();
      
      System.out.println("Enter the a matrix");
      for( i=0; i<m; i++)
      {
          for( j=0; j<m; j++)
          {
              a[i][j] = input.nextInt();
          }
      }
      System.out.println("Enter the b matrix");
      for( i=0; i<m; i++)
      {
          for( j=0; j<m; j++)
          {
              b[i][j] = input.nextInt();
          }
      }
      
      for ( i = 0; i < m; i++)
      {
          for ( j = 0; j < m; j++)
          {
              for (k = 0; k < m; k++)
              {
                  c[i][j] = c[i][j] + a[i][k] * b[k][j];
              }
          }
      }
      System.out.println("\n");
      System.out.println("The matrix after multiplication is as follows");
      for( i=0;i<m;i++){
          for(j=0;j<m;j++){
              System.out.print(c[i][j]+"\t");
          }
          System.out.println("\n");
      }           
  }


  

}
