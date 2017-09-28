package in.vamsoft.training.general;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathFirst {

  private Math math = new Math();

  @BeforeClass
  public static void classinit() {
    System.out.println("MathFirst.classinit()");
  }

  @Before
  public void initMathObject() {
    System.out.println("MathFirst.initMathObject()");
    math = new Math();
  }

  @After
  public void destoryMathObject() {

    System.out.println("MathFirst.destoryMathObject()");
    math = new Math();
  }

  @Test
  public void testcase1() {

    System.out.println("MathFirst.testcase1()");
    double result = math.sum(56.0, 10.0);

    double expected = 66.0;
    Assert.assertEquals(expected, result, 0);

  }

  @Test
  public void testcase2() {
    System.out.println("MathFirst.testcase2()");
    double result = math.sum(0, 0);

    double expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testcase3() {
    System.out.println("MathFirst.testcase3()");
    double result = math.sum(-56.0, 10.0);

    double expected = -46.0;
    Assert.assertEquals(expected, result, 0);

  }

  @Test
  public void testcase4() {
    System.out.println("MathFirst.testcase4()");
    double result = math.sum(-56.0, -10.0);

    double expected = -66.0;
    Assert.assertEquals(expected, result, 0);

  }

  @Test
  public void testcase5() {
    System.out.println("MathFirst.testcase5()");
    int result = math.sum(34, 16);
    int expected = 50;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testcase6() {
    System.out.println("MathFirst.testcase6()");
    int result = math.sum(0, 0);
    int expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testcase7() {
    System.out.println("MathFirst.testcase7()");
    int result = math.sum(34, -16);
    int expected = 18;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testcase8() {
    System.out.println("MathFirst.testcase8()");
    int result = math.sum(-34, -16);
    int expected = -50;
    Assert.assertEquals(expected, result, 0);
  }
}
