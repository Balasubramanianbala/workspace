package in.vamsoft.javabasic;

public class NumberTable {

  public static void main(String[] args) {
    try {
    int i,n;
              
       n=Integer.parseInt(args[0]);
    for (i = 1; i < 16; i++) {

      System.out.println(i + "*" +n+ "=" + i *n );
    }   
    }catch (NumberFormatException e) {
      System.out.println(e.getMessage());
    }
  }
}
