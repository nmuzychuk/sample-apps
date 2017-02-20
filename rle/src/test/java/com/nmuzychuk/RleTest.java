package com.nmuzychuk;

import junit.framework.TestCase;

public class RleTest extends TestCase {
    public void testEncodeCase1() {
        assertEquals("2a", Rle.encode("aa"));
    }

    public void testEncodeCase2() {
        String s1, s2, s;
        s1 = "WWWWWWWWWWWWBWWWWWWWWWWWWBBB";
        s2 = "WWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
        s = s1 + s2;

        assertEquals("12W1B12W3B24W1B14W", Rle.encode(s));
    }

    public void testEncodeCase3() {
        String s = "ABCABCABCDDDFFFFFF";
        assertEquals("1A1B1C1A1B1C1A1B1C3D6F", Rle.encode(s));
    }

    public void testDecodeCase1() {
        assertEquals("aa", Rle.decode("2a"));
    }

    public void testDecodeCase2() {
        String e1, e2, e;
        e1 = "WWWWWWWWWWWWBWWWWWWWWWWWWBBB";
        e2 = "WWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW";
        e = e1 + e2;

        assertEquals(e, Rle.decode("12W1B12W3B24W1B14W"));
    }

    public void testDecodeCase3() {
        String e = "ABCABCABCDDDFFFFFF";

        assertEquals(e, Rle.decode("1A1B1C1A1B1C1A1B1C3D6F"));
    }
}
