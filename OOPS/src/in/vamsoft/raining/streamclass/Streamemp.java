package in.vamsoft.raining.streamclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Streamemp {
  
  public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException{
    Employee employee=new Employee("Guna", 24, "guna002@gmail.com");
    ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("object.txt"));
    objectOutputStream.writeObject(employee);
    System.out.println("object written");
    ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("object.txt"));
    Employee emp=(Employee)inputStream.readObject();
    System.out.println(emp);
  }

}
