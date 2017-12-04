
package in.vamsoft.training.jdbcexample;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JdbcBatch {

  public static void main(String[] args) {
    try (Connection con = Dbpropertiescon.getConnection();) {
      PreparedStatement pst = con
          .prepareStatement("INSERT INTO empcopy (empid, fname, salary, doj, deptid) VALUES (?, ?, ?, ?,?)");
      Scanner sc = new Scanner(System.in);
      Scanner sc1 = new Scanner(System.in);
      // con=null;
      int empid, deptid;
      String fname, doj;
      LocalDate lc;
      double sal;
      String ans = "n";
      do {
        System.out.println("employee  details ");
        System.out.println("enter the empid,fname,sal,doj,deptid");
        empid = sc.nextInt();
        fname = sc1.nextLine();
        sal = sc.nextDouble();
        doj = sc1.nextLine();
        lc = LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        java.sql.Date hireDate = java.sql.Date.valueOf(lc);
        deptid = sc.nextInt();
        pst.setInt(1, empid);
        pst.setString(2, fname);
        pst.setDouble(3, sal);
        pst.setDate(4, hireDate);
        pst.setInt(5, deptid);
        pst.addBatch();
        System.out.println("insert more click row (y/n)");
        ans = sc.next();
      } while (ans.equalsIgnoreCase("y"));
      int[] rowsInserted = pst.executeBatch();
      for (int row : rowsInserted) {
        if (row != 0)
          System.out.println("Employee added successfully");
        else
          System.out.println("Could not add Employee");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
