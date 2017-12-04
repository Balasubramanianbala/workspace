package in.vamsoft.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  Connection con = null;

  @Override
  public void init() throws ServletException {
    super.init();

    try {
   //   FileReader reader = new FileReader("/home/vamsoft/Desktop/db.properties");
    //  Properties properties = new Properties();
      // properties.load(reader);
      String driver = "oracle.jdbc.driver.OracleDriver";//properties.getProperty("driver");
      String url = "jdbc:oracle:thin:@192.168.10.77:1521:xe";//properties.getProperty("url");
      String username = "hr";//properties.getProperty("username");
      String password = "password";//properties.getProperty("password");
      System.out.println(driver + " " + url);
      con = DriverManager.getConnection(url, username, password);
      System.out.println("connection done");
    }  catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    PrintWriter out = response.getWriter();
    response.setContentType("text/html");
    String name = request.getParameter("name");
    String dob = request.getParameter("dob");
    String address = request.getParameter("address");
    String phone = request.getParameter("phone");
    String gender = request.getParameter("gender");
    String hobbies = request.getParameter("hobbies");
    LocalDate doj;
    try (PreparedStatement pst = con.prepareStatement(
        "insert into customerreg1(cus_name,cus_dob,cus_address,phoneno,gender,hobbies) values (?,?,?,?,?,?)");) {
      doj = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

      pst.setString(1, name);
      pst.setDate(2, Date.valueOf(doj));
      pst.setString(3, address);
      pst.setString(4, phone);
      pst.setString(5, gender);
      pst.setString(6, hobbies);
      int rows = pst.executeUpdate();
      if (rows > 0) {
        out.println("inserted successfully");
      } else {
        out.println("not inserted");
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("" + name);
    System.out.println("" + dob);
    System.out.println("" + address);
    System.out.println("" + phone);
    System.out.println("" + gender);
    System.out.println("" + hobbies);
    out.println("Sucessfully entered in servlet");
  }

}
