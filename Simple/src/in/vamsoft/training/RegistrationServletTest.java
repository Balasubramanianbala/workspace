package in.vamsoft.training;

import static org.junit.Assert.*;

import javax.servlet.ServletException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegistrationServletTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Test
  public void testInit() {
    RegistrationServlet rs=new RegistrationServlet();
        try {
          rs.init();
          assertTrue(true);
        } catch (ServletException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
  }

}
