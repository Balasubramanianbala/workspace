package in.vamsoft.training.jdbcexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmployeeMainUI {
  
  public static void main(String[] args) {
    EmployeeDao dao= EmployeeFactoryDao.getEmployeeDAO();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    try {
      int empid,deptid;
      String fname;
      LocalDate doj;
      double sal;
      System.out.println("employee  id ");
      //System.out.println("enter the empid,fname,sal,doj,deptid");
      empid=Integer.parseInt(br.readLine());
      /*fname=br.readLine();
      sal=Double.parseDouble(br.readLine());
      doj=LocalDate.parse(br.readLine(),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
      deptid=Integer.parseInt(br.readLine());
      Employee employee=new  Employee(empid,fname,sal,doj,deptid);*/
      boolean insert=dao.removeEmployee(empid);
      if(insert)
        System.out.println("Employee added successfully");
      else
         System.out.println("Could not add Employee");
      
    }catch(NumberFormatException|IOException e) {
      e.printStackTrace();
    }
  }

}
