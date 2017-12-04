package in.vamsoft.training.jdbcexample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.omg.CosNaming.NamingContextPackage.NotFound;

public class EmployeeJdbcimpl implements AutoCloseable,EmployeeDao{

  public static Logger log = Logger.getLogger(EmployeeJdbcimpl.class);
  ResultSet rs = null;
  Connection con=null;
  
  public EmployeeJdbcimpl() {
    super();
    con = Dbpropertiescon.getConnection();
  }
  public boolean addEmpolyee(Employee employee) {
    try(PreparedStatement pst=con.prepareStatement("INSERT INTO empcopy (empid, fname, salary, doj, deptid) VALUES (?, ?, ?, ?,?)");) {
   pst.setInt(1, employee.getEmpid());
   pst.setString(2, employee.getFname());
   pst.setDouble(3,employee.getSalary());
   pst.setDate(4, Date.valueOf(employee.getDoj()));
   pst.setInt(5, employee.getDeptid());
   
   int rowsInserted = pst.executeUpdate();
   return rowsInserted>0?true:false;
    }catch (SQLException e) {
      log.error("error while establishing the connection", e);
    }
    return false;
  }
   /*public boolean updateEmployee(Employee employee) {
     try(PreparedStatement pst=con.prepareStatement("upadte set salary=?"))
   }*/
  public boolean removeEmployee(int empid) {
    try(PreparedStatement pst=con.prepareStatement("delete from empcopy where empid=?");){
      pst.setInt(1, empid);
      int rowsInserted = pst.executeUpdate();
      return rowsInserted>0?true:false;
      
    } catch (SQLException e) {
log.error("error while establishing connection the connection",e);
    }
    return false;
  }
  public Employee findEmployee(int empid) {
    try(PreparedStatement pst=con.prepareStatement("select * from empcopy where empid=?");){
      pst.setInt(1, empid);
      rs=pst.executeQuery();
      Employee emp=null;
      if(rs.next()) {
      emp=new Employee();
      emp.setEmpid(rs.getInt(1));
      emp.setFname(rs.getString(2));
      emp.setSalary(rs.getDouble(3));
      emp.setDoj(rs.getDate(4).toLocalDate());
      emp.setDeptid(rs.getInt(5));
      return emp;
      }else {
        throw new Exception("Employee with code"+empid+"not found");
      }
    } catch (SQLException e) {
      log.error("error while establishing connection the connection",e);

    } catch (Exception e) {
      log.error("error while establishing Exception throw connection",e);

    }
    return null;
  }
  @Override
  public void close() throws Exception {
    Connection cn = null;
    cn=Dbpropertiescon.closeconnection(cn);
    
  }
  }

