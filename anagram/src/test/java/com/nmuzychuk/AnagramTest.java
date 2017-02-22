package com.nmuzychuk;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AnagramTest {
    @Test
    public void testOneCharTrue() {
        assertTrue(Anagram.isAnagram("a", "a"));
    }

    @Test
    public void testOneCharFalse() {
        assertFalse(Anagram.isAnagram("a", "b"));
    }

    @Test
    public void testTwoCharsTrue() {
        assertTrue(Anagram.isAnagram("ab", "ba"));
    }

    @Test
    public void testTwoCharsFalse() {
        assertFalse(Anagram.isAnagram("ab", "ca"));
    }

    @Test
    public void testMultipleCharsTrue() {
        assertTrue(Anagram.isAnagram("silent", "listen"));
    }

    @Test
    public void testMultipleCharsFalse() {
        assertFalse(Anagram.isAnagram("book", "cook"));
    }
}
