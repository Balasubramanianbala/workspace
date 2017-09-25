package in.vamsoft.training.general;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {

  private Math math = null;
  

  @BeforeClass
  public static void classInit() {

    System.out.println("MathTest.classInit()");
  }
  
  
  @Before
  public void initMathObject() {
    System.out.println("MathTest.initMathObject()");
    math = new Math();
  }
  
  @After
  public void destroyMathObject() {
    System.out.println("MathTest.destroyMathObject()");
    math = null;
  }
  
  
  @Test
  public void testCase1() {
    System.out.println("MathTest.testCase1()");
    double result = math.sum(56.0, 10.0);
    
    double expected = 66.0;
    Assert.assertEquals(expected, result, 0);

  }

  
  @Test
  public void testCase2() {
    System.out.println("MathTest.testCase2()");
    double result = math.sum(0, 0);
    
    double expected = 0.0;
    Assert.assertEquals(expected, result, 0);

  }
}
