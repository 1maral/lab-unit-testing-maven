package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSum {
    int[] values1 = { 1, 2, 3 };
    int[] values2 = { 523, -25223, 464346334};
    int[] values3 = { 0, -7, 0 };
    @Test
    public void test4b1 () {
      assertEquals(6, SampleMethods.sum(values1), "stupid test");
    } // test2()

    @Test
    public void test4b2 () {
      assertEquals(464321634, SampleMethods.sum(values2), "stupid test");
    } // test2()

    @Test
    public void test4b3 () {
      assertEquals(-7, SampleMethods.sum(values3), "stupid test");
    } // test2()

    public void testExtremes() {
        int tmp = Integer.MAX_VALUE - 10;
        int[] values = { tmp, tmp, -tmp, -tmp };
        assertEquals(0, SampleMethods.sum(values), "extreme values");
     } // testExtremes

}

// Exercise 4e : I believe that it meets the pre-conditions of sum
// We expect it to pass the test.
// 4f : The test is so stupid that it shouldn’t matter, because for n values,
// number of subsets will be too big to consider all the possibilities.
