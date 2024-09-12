package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestRemB {
    
  /**
   * Check that removeBs works as expected.
   */
  @Test
  public void testRemoveBs() {
    assertEquals("", 
                 SampleMethods.removeBs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeBs("hellob"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeBs("b"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeBs("bbbb"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeBs("painb"),
                 "eliminate one b, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeBs("blphabet"),
                 "eliminate many as, medium string");
  } 

}
