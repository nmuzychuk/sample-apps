package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Base64Test {
    @Test
    public void testEncodeOneChar() {
        assertEquals("aw==", Base64.encode("k"));
    }

    @Test
    public void testEncodeTwoChars() {
        assertEquals("a2w=", Base64.encode("kl"));
    }

    @Test
    public void testEncodeThreeChars() {
        assertEquals("a2xt", Base64.encode("klm"));
    }

    @Test
    public void testEncodeFourChars() {
        assertEquals("a2xtbg==", Base64.encode("klmn"));
    }
}
