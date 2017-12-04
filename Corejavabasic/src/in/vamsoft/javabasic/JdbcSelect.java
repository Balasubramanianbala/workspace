package in.vamsoft.javabasic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class JdbcSelect {

  public static Logger log = Logger.getLogger(JdbcSelect.class);
  
  public static void main(String[] args) {
    log.info("main method execution started");
    try {
   
    //ResultSet rs = null;
    Connection con = JdbcConnection.getConnection();
    System.out.println(con);
    Statement st=con.createStatement();   
    ResultSet   rs=st.executeQuery("select employee_id,first_name,salary from employees");
      while (rs.next()) {
        System.out.println(rs.getInt("EMPLOYEE_ID") + "\t" + rs.getString("FIRST_NAME") + "\t" + rs.getDouble("SALARY") + "\t");
      }
    } catch (SQLException e) {
      
      log.error("query not executed", e);
    }
   
  }

}
