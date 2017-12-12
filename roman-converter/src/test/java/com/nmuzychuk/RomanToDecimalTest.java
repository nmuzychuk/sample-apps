package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.RomanToDecimal.convert;

public class RomanToDecimalTest {

    @Test
    public void testConvert() {
        assertEquals(1, convert("I"));
        assertEquals(2, convert("II"));
        assertEquals(3, convert("III"));
        assertEquals(4, convert("IV"));
        assertEquals(5, convert("V"));
        assertEquals(6, convert("VI"));
        assertEquals(7, convert("VII"));
        assertEquals(8, convert("VIII"));
        assertEquals(9, convert("IX"));
        assertEquals(10, convert("X"));
        assertEquals(88, convert("LXXXVIII"));
        assertEquals(400, convert("CD"));
        assertEquals(4999, convert("MMMMCMXCIX"));
    }

}
