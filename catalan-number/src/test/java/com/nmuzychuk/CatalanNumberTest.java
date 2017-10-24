package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatalanNumberTest {

    @Test
    public void testZero() {
        assertEquals(1, CatalanNumber.ofNumber(0));
    }

    @Test
    public void testOne() {
        assertEquals(1, CatalanNumber.ofNumber(1));
    }

    @Test
    public void testTwo() {
        assertEquals(2, CatalanNumber.ofNumber(2));
    }

    @Test
    public void testThree() {
        assertEquals(5, CatalanNumber.ofNumber(3));
    }

    @Test
    public void testTen() {
        assertEquals(16796, CatalanNumber.ofNumber(10));
    }

}
