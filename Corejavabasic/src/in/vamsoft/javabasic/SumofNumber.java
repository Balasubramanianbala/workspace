package in.vamsoft.javabasic;

public class SumofNumber {

  public static void main(String[] args) {
   try {
    int s = 0, i, j;
    System.out.println("Enter the number");
    j = Integer.parseInt(args[0]);
    for (i = 1; i < j; i++) {

      s = s + i;
    }
    System.out.println("sum of Number=" + s);
   }catch (NumberFormatException e) {
    System.out.println(e.getMessage());
  }
  }

}
