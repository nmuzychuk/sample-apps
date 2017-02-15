package com.nmuzychuk;

import junit.framework.TestCase;

public class RleTest
        extends TestCase {

    public void testEncodeCase1() {
        assertEquals("2a", Rle.encode("aa"));
    }

    public void testEncodeCase2() {
        assertEquals("12W1B12W3B24W1B14W", Rle.encode("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW"));
    }

    public void testEncodeCase3() {
        assertEquals("1A1B1C1A1B1C1A1B1C3D6F", Rle.encode("ABCABCABCDDDFFFFFF"));
    }

    public void testDecodeCase1() {
        assertEquals("aa", Rle.decode("2a"));
    }

    public void testDecodeCase2() {
        assertEquals("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW", Rle.decode("12W1B12W3B24W1B14W"));
    }

    public void testDecodeCase3() {
        assertEquals("ABCABCABCDDDFFFFFF", Rle.decode("1A1B1C1A1B1C1A1B1C3D6F"));
    }
}
