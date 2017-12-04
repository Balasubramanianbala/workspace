package in.vamsoft.training.jdbcexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Jdbcupdate {
  
  public static Logger log = Logger.getLogger(Jdbcupdate.class);
  
  public static void main(String[] args) {
    log.info("main method execution started");
    int empid,salary;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the empid and salary increase");
    empid=sc.nextInt();
    salary=sc.nextInt();    
    Statement st = null;
    Connection con = Dbpropertiescon.getConnection();
    PreparedStatement pst=null;
    try {
     pst=con.prepareStatement("update empbala set salary=salary+? where empid=?");
     pst.setInt(1, salary);
     pst.setInt(2, empid);
     int rowsupdate=pst.executeUpdate();
     System.out.println(rowsupdate);    
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }finally {
      try {
    pst.close();
      
      log.info("connection closed successfully");
    } catch (SQLException e) {
      
      log.error("error in closing",e);
    }
      Dbpropertiescon.closeconnection(con);
  }
  }
}
