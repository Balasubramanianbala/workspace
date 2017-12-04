package in.vamsoft.training.jdbcexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Dbpropertiescon {
  public static Logger  log=Logger.getLogger(FstjdbcDemo.class);
  public static Connection getConnection() {
    String driver=null;
    String url=null;
    String username=null;
    String password=null;
    Connection con=null;
    try {
      FileReader reader=new FileReader("src/db.properties");
      Properties properties= new Properties();
      properties.load(reader);
      driver=properties.getProperty("driver");
      url=properties.getProperty("url");
      username=properties.getProperty("username");
      password=properties.getProperty("password");
      con=DriverManager.getConnection(url,username,password);
      log.info("connection done");
      
    }catch (FileNotFoundException e) {
      
     log.error("db properties file not found",e);
    } catch (IOException e) {
      log.error("Io exception not found",e);
    } catch (SQLException e) {
      log.error("error while closing connection",e);      
    }
    return con;
  }
 
  public static Connection closeconnection(Connection con) {
    try {
      con.close();
      log.info("connection closed successfully");
    } catch (SQLException e) {
      
      log.error("error in closing",e);
    }
    return con;
    
  }
}
