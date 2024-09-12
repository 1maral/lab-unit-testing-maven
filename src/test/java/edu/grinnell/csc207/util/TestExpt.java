package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestExpt {

    @Test
    void forTest1() {
    int expected = 1;
    for (int power = 0; power < 10; power++){
        assertEquals(expected, SampleMethods.expt(2, power));
        expected = expected * 2;
    }
      } // forTest()
      @Test
      void forTest2() {
      for (int num = -5; num < 5; num++){
          assertEquals(num * num, SampleMethods.expt(num, 2));
      }
        } // forTest()
}
