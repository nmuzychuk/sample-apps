package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TNumberTest {
    @Test
    public void testOne() {
        final int expected = 1;
        final int n = 1;

        assertEquals(expected, TNumber.tNumberLoop(n));
        assertEquals(expected, TNumber.tNumberRec(n));
    }

    @Test
    public void testTwo() {
        final int expected = 3;
        final int n = 2;

        assertEquals(expected, TNumber.tNumberLoop(n));
        assertEquals(expected, TNumber.tNumberRec(n));
    }

    @Test
    public void testThree() {
        final int expected = 6;
        final int n = 3;

        assertEquals(expected, TNumber.tNumberLoop(n));
        assertEquals(expected, TNumber.tNumberRec(n));
    }

    @Test
    public void testTen() {
        final int expected = 55;
        final int n = 10;

        assertEquals(expected, TNumber.tNumberLoop(n));
        assertEquals(expected, TNumber.tNumberRec(n));
    }

    @Test
    public void testOneHundred() {
        final int expected = 5050;
        final int n = 100;

        assertEquals(expected, TNumber.tNumberLoop(n));
        assertEquals(expected, TNumber.tNumberRec(n));
    }
}
