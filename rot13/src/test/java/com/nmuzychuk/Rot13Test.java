package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Rot13Test {
    @Test
    public void testRot13() {
        assertEquals("abcdefghijklmnopqrstuvwxyz",
                Rot13.rotate("nopqrstuvwxyzabcdefghijklm"));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                Rot13.rotate("NOPQRSTUVWXYZABCDEFGHIJKLM"));
        assertEquals("Gur Dhvpx Oebja Sbk Whzcf Bire Gur Ynml Qbt",
                Rot13.rotate("The Quick Brown Fox Jumps Over The Lazy Dog"));
    }
}
