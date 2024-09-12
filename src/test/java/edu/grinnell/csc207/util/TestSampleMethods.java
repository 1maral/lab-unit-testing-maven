package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {

  @Test
  public void test2() {
    assertEquals(15, 3*5, "stupid test");
  } // test2()

  @Test
  public void test3a() {
    assertEquals(32, SampleMethods.c2f(0), "Temp conversion");
  } // test3a()

  @Test
  public void test3b() {
    assertEquals(212, SampleMethods.c2f(100), "Temp conversion");
  } // test3a()
  
  @Test
  public void test3d() {
    assertEquals(-40, SampleMethods.c2f(-40), "Temp conversion");
  } // test3d()

  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()
} // class TestSampleMethods

// Exercise 2
// b. What do you expect to happen when you run your tests?
// I expected to fail, my partner expected it to run if the other method fail
// 