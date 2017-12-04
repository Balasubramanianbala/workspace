package in.vamsoft.javabasic;

  import java.io.FileNotFoundException;
  import java.io.FileReader;
  import java.io.IOException;
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.SQLException;
  import java.util.Properties;

  import org.apache.log4j.Logger;

  public class  JdbcConnection {
    public static Logger  log=Logger.getLogger(JdbcConnection.class);
  
    public static Connection getConnection() {
      System.out.println("JdbcConnection.getConnection()");
//      String driver=null;
//      String url=null;
//      String username=null;
//      String password=null;
     // Connection con=null;
      try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("inside try");
        FileReader reader=new FileReader("db.properties");
        Properties properties= new Properties();
        properties.load(reader);
        String driver=properties.getProperty("driver");
        String url=properties.getProperty("url");
        String username=properties.getProperty("username");
        String password=properties.getProperty("password");
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("connection"+con);
        log.info("connection done");
        return con;
      }catch (FileNotFoundException e) {
        
       log.error("db properties file not found",e);
      } catch (IOException e) {
        log.error("Io exception not found",e);
      } catch (SQLException e) {
        log.error("error while closing connection",e);      
      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      return null;
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



