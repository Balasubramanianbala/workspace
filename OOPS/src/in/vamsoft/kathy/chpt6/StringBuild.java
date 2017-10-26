package in.vamsoft.kathy.chpt6;

public class StringBuild {

  /**
   * @param args.
   */
  public static void main(String[] args) {
    String s = "hello";
    String s2 = s;
    s = s.concat("world");
    s2 = s.toUpperCase();
    s = s.toLowerCase();
    System.out.println("s=" + s2);
    System.out.println(s.equalsIgnoreCase("helloworld"));
    System.out.println(s.equalsIgnoreCase("hlleowodlr"));
    System.out.println(s.length());
    System.out.println(s.substring(5));
    System.out.println(s.substring(0, 5));
    System.out.println(s.toString());
    System.out.println(s.replace("l", "L"));
    String x = "     hi     ";
    System.out.println(x.trim() + "java");

  }

}
