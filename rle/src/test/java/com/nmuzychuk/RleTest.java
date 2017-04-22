package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RleTest {
    @Test
    public void testEncodeCase1() {
        assertEquals("2a", Rle.encode("aa"));
    }

    @Test
    public void testEncodeCase2() {
        StringBuilder sb = new StringBuilder();
        sb.append("WWWWWWWWWWWWBWWWWWWWWWWWWBBB");
        sb.append("WWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW");

        assertEquals("12W1B12W3B24W1B14W", Rle.encode(sb.toString()));
    }

    @Test
    public void testEncodeCase3() {
        String s = "ABCABCABCDDDFFFFFF";
        assertEquals("1A1B1C1A1B1C1A1B1C3D6F", Rle.encode(s));
    }

    @Test
    public void testDecodeCase1() {
        assertEquals("aa", Rle.decode("2a"));
    }

    @Test
    public void testDecodeCase2() {
        StringBuilder sb = new StringBuilder();

        sb.append("WWWWWWWWWWWWBWWWWWWWWWWWWBBB");
        sb.append("WWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW");

        assertEquals(sb.toString(), Rle.decode("12W1B12W3B24W1B14W"));
    }

    @Test
    public void testDecodeCase3() {
        String e = "ABCABCABCDDDFFFFFF";

        assertEquals(e, Rle.decode("1A1B1C1A1B1C1A1B1C3D6F"));
    }
}
