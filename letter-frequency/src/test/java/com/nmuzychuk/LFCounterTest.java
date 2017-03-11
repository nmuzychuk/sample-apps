package com.nmuzychuk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LFCounterTest {
    private String s;

    @Test
    public void testEmpty() {
        s = "";

        assertEquals("{}", LFCounter.getCount(s));
    }

    @Test
    public void testOneChar() {
        s = "a";

        assertEquals("{a=1}", LFCounter.getCount(s));
    }

    @Test
    public void testTwoCharsCase1() {
        s = "ab";

        assertEquals("{a=1, b=1}", LFCounter.getCount(s));
    }

    @Test
    public void testTwoCharsCase2() {
        s = "aa";

        assertEquals("{a=2}", LFCounter.getCount(s));
    }

    @Test
    public void testTwoCharsCase3() {
        s = "Aa";

        assertEquals("{a=2}", LFCounter.getCount(s));
    }

    @Test
    public void testMultipleCharsCase1() {
        s = "zoo";

        assertEquals("{o=2, z=1}", LFCounter.getCount(s));
    }

    @Test
    public void testMultipleCharsCase2() {
        s = "google";

        assertEquals("{e=1, g=2, l=1, o=2}", LFCounter.getCount(s));
    }

    @Test
    public void testMultipleCharsCase3() {
        s = "What are letter frequencies in English language?";

        String str1 = "{a=4, c=1, e=8, f=1, g=3, h=2, i=3, l=3, ";
        String str2 = "n=4, q=1, r=3, s=2, t=3, u=2, w=1}";

        assertEquals(str1 + str2, LFCounter.getCount(s));
    }
}
