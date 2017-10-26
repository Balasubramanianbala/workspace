package in.vamsoft.training.trainer;

public class Finally {

  public int div(int n, int n1) {
    try {
      int r = n / n1;
      return r;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return 0;
    } finally {
      System.out.println("statement end");
    }
  }

  public static void main(String[] args) {
    Finally f = new Finally();
    System.out.println("division number" + f.div(25, 0));
  }
}
