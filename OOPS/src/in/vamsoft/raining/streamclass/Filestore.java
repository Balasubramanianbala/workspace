package in.vamsoft.raining.streamclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Filestore {
  
  public static void main(String[] args) throws IOException {
    
    try(BufferedReader cr=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fw=new BufferedWriter(new FileWriter("data.txt"));){
        BufferedReader fr=new BufferedReader(new FileReader("data.txt"));
      System.out.println("enter the name");
      String name=cr.readLine();
      fw.write("Name:"+name);
      fw.newLine();
      System.out.println("enter the age");
      String age=cr.readLine();
      fw.write("age:"+age);
      fw.newLine();
      System.out.println("enter your city");
      String city=cr.readLine();
      fw.write("city:"+city);
      fw.newLine();
      String data="";
      System.out.println("the data entered");
      while((data=fr.readLine())!=null) {
        System.out.println(data);
        
      }
      
    }
    } 
  }


