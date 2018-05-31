package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoundexTest {
    @Test
    public void testSoundex() {
        assertEquals("R163", Soundex.compute("Robert"));
        assertEquals("R163", Soundex.compute("Rupert"));
        assertEquals("T522", Soundex.compute("Tymczak"));
        assertEquals("H555", Soundex.compute("Honeyman"));
    }
}
