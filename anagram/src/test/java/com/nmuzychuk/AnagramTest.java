package com.nmuzychuk;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static com.nmuzychuk.Anagram.isAnagram;

import org.junit.Test;

public class AnagramTest {
    @Test
    public void testOneCharTrue() {
        assertTrue(isAnagram("a", "a"));
    }

    @Test
    public void testOneCharFalse() {
        assertFalse(isAnagram("a", "b"));
    }

    @Test
    public void testTwoCharsTrue() {
        assertTrue(isAnagram("ab", "ba"));
    }

    @Test
    public void testTwoCharsFalse() {
        assertFalse(isAnagram("ab", "ca"));
    }

    @Test
    public void testMultipleCharsTrue() {
        assertTrue(isAnagram("silent", "listen"));
    }

    @Test
    public void testMultipleCharsFalse() {
        assertFalse(isAnagram("book", "cook"));
    }
}
