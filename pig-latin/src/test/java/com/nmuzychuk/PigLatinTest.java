package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.PigLatin.alter;

public class PigLatinTest {

    @Test
    public void testConsonant() {
        assertEquals("igpay", alter("pig"));
        assertEquals("atinlay", alter("latin"));

        assertEquals("eerschay", alter("cheers"));
        assertEquals("ingstray", alter("string"));
    }

    @Test
    public void testVowel() {
        assertEquals("eatay", alter("eat"));
        assertEquals("eggay", alter("egg"));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testNoVowel() {
        assertEquals("", alter("crwth"));
    }

}
