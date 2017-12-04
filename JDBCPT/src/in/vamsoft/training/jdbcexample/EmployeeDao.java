package in.vamsoft.training.jdbcexample;

public interface EmployeeDao {
  
  public boolean addEmpolyee(Employee employee);
  
  public boolean removeEmployee(int empid);
  
  public Employee findEmployee(int empid) ;
  

}
