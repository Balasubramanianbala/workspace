package in.vamsoft.training.jdbcexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

public class FstjdbcDemo {

  public static Logger log = Logger.getLogger(FstjdbcDemo.class);

  public static void main(String[] args) {
    log.info("main method execution started");
    Statement st = null;
    ResultSet rs = null;
    Connection con = Dbpropertiescon.getConnection();

    try {
      st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
      rs = st.executeQuery("select empid,fname,salary,doj,deptid from empbala");
      ResultSetMetaData rsmd=rs.getMetaData();
      //
      
      System.out.println("empid\tfname\tsalary\tdoj\tdeptid");
      int colcount=rsmd.getColumnCount();
      for(int i=1;i<=colcount;i++)
      {
        System.out.print(rsmd.getColumnName(i)+"\t");
      }
      System.out.println();
      while (rs.next()) {
        System.out.println(rs.getInt("empid") + "\t" + rs.getString("fname") + "\t" + rs.getDouble("salary") + "\t"
            + rs.getDate("doj") + "\t" + rs.getInt("deptid"));
      }
      System.out.println("going back in the result");
      rs.previous();
      rs.absolute(11);
      rs.updateInt(5, 1000);
      rs.updateRow();
      System.out.println(rs.getInt("empid") + "\t" + rs.getString("fname") + "\t" + rs.getDouble("salary") + "\t"
          + rs.getDate("doj") + "\t" + rs.getInt("deptid"));
    } catch (SQLException e) {
      log.error("error while establishing the connection", e);

    } finally {
      try {
        rs.close();
        st.close();
        Dbpropertiescon.closeconnection(con);
      } catch (Exception e) {
        log.error("error while closing connection", e);
      }
    }
  }

}
