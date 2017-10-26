package in.vamsoft.training.trainer;

public class Arrayindex {
  /*
   * @param args
   */
  public static void main(String[] args) {

    try {
      // Scanner scan = new Scanner(System.in);
      int n = 0, n1 = 0, result;
      // System.out.println("enter the A and B number");
      n = Integer.parseInt(args[0]);
      n1 = Integer.parseInt(args[1]);
      /*
       * n = scan.nextInt(); n1 = scan.nextInt();
       */
      result = n / n1;
      System.out.println("the quotient" + result);

    } catch (ArithmeticException | NumberFormatException ae) {
      System.out.println("Not Divisble by zero" + ae.getMessage());
    } catch (ArrayIndexOutOfBoundsException aie) {
      System.out.println("please provide two numbers as commandline argments");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }
  

}
