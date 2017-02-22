package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {
    @Test
    public void testZero() {
        final int expected = 1;
        final int n = 0;

        assertEquals(expected, Factorial.factorialLoop(n));
        assertEquals(expected, Factorial.factorialRec(n));
    }

    @Test
    public void testOne() {
        final int expected = 1;
        final int n = 1;

        assertEquals(expected, Factorial.factorialLoop(n));
        assertEquals(expected, Factorial.factorialRec(n));
    }

    @Test
    public void testTwo() {
        final int expected = 2;
        final int n = 2;

        assertEquals(expected, Factorial.factorialLoop(n));
        assertEquals(expected, Factorial.factorialRec(n));
    }

    @Test
    public void testFive() {
        final int expected = 120;
        final int n = 5;

        assertEquals(expected, Factorial.factorialLoop(n));
        assertEquals(expected, Factorial.factorialRec(n));
    }

    @Test
    public void testTen() {
        final int expected = 3628800;
        final int n = 10;

        assertEquals(expected, Factorial.factorialLoop(n));
        assertEquals(expected, Factorial.factorialRec(n));
    }
}
