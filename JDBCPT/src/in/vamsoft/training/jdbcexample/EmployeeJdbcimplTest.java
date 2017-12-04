package in.vamsoft.training.jdbcexample;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeJdbcimplTest {
  static EmployeeDao employeeDao;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    employeeDao = EmployeeFactoryDao.getEmployeeDAO();
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Test
  public void testAddEmpolyee() {
    Employee employee=new Employee(100,"raja",25000,LocalDate.of(2017, 10, 11),200);
    assertTrue(employeeDao.addEmpolyee(employee));
  }
  

  @Test
  public void testRemoveEmployee() {
    assertTrue(employeeDao.removeEmployee(100));
  }

  @Test
  public void testFindEmployee() {
    Employee  employee=employeeDao.findEmployee(1234);
    assertEquals(1234, employee.getEmpid());
  }

}
