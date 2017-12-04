package in.vamsoft.javabasic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class JdbcCreate {

  public static Logger log = Logger.getLogger(JdbcCreate.class);

  public static void main(String[] args) {
    log.info("main method execution started");
    try {

      // ResultSet rs = null;
      Connection con = JdbcConnection.getConnection();
      System.out.println(con);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("create table book (bid number(4),bname varchar2(10),price number(6))");

    } catch (SQLException e) {

      log.error("query not executed", e);
    }

  }

}
