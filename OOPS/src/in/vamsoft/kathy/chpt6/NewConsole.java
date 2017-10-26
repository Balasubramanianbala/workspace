package in.vamsoft.kathy.chpt6;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class NewConsole {

  /**
   * @param args.
   */
  public static void main(String[] args) {

    Console c = System.console();
    char[] pw;

    pw = c.readPassword("%s", "pwd:");
    for (char ch : pw)
      c.format("%c", pw);
    c.format("\n");
    MyUtility m = new MyUtility();
    while (true) {
      String name = c.readLine("%s", "input?:");
      c.format("output", m.doStuff(name));
    }

  }

}
