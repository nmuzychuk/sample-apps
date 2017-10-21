package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.nmuzychuk.PrimeNumber.isPrime;
import static com.nmuzychuk.PrimeNumber.printPrimes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumberTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testIsPrime() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertTrue(isPrime(5));
        assertTrue(isPrime(11));

        assertFalse(isPrime(1));
        assertFalse(isPrime(10));
        assertFalse(isPrime(55));
    }

    @Test
    public void testPrintPrimes() {
        final String expected = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 ";

        printPrimes(50);

        assertEquals(expected, out.toString());
    }

}
