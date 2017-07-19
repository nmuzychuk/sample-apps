package com.nmuzychuk;

import org.junit.Test;

import static com.nmuzychuk.PalindromeChecker.isPalindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTest {

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testEmptyString() {
        assertTrue(isPalindrome(""));
    }

    @Test
    public void testOneChar() {
        assertTrue(isPalindrome("p"));
    }

    @Test
    public void testTwoCharsPalindrome() {
        assertTrue(isPalindrome("Pp"));
    }

    @Test
    public void testTwoCharsNotPalindrome() {
        assertFalse(isPalindrome("NP"));
    }

    @Test
    public void testMultipleCharsPalindrome() {
        assertTrue(isPalindrome("Borrow or rob"));
    }
}
