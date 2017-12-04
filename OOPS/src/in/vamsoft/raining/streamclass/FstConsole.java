package in.vamsoft.raining.streamclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FstConsole {
  public static void main(String[] args) {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name="";
    System.out.println("please enter the name");
    do{
      try {
    
      name=br.readLine();
      System.out.println("hello"+ name);
      br.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }while(!(name.equals("quit")));
  }

}
