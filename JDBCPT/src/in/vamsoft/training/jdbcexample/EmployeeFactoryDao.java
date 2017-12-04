package in.vamsoft.training.jdbcexample;

public class EmployeeFactoryDao {
  
  public static EmployeeDao getEmployeeDAO() {
    return new  EmployeeJdbcimpl();
  }

}
