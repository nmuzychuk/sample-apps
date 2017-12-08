package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.IntegerReverser.reverse;

public class IntegerReverserTest {

    @Test
    public void testReverse() {
        assertEquals(0, reverse(0));
        assertEquals(321, reverse(123));
        assertEquals(-321, reverse(-123));
    }

}
