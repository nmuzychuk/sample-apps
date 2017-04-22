package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.BalancedParentheses.isBalanced;

public class BalancedParenthesesTest {
    @Test
    public void testEmpty() {
        String s = "";

        assertEquals(true, isBalanced(s));
    }

    @Test
    public void testOneChar() {
        String s = "(";

        assertEquals(false, isBalanced(s));
    }

    @Test
    public void testTwoBalanced() {
        String s = "()";

        assertEquals(true, isBalanced(s));
    }

    @Test
    public void testTwoUnbalanced() {
        String s = "((";

        assertEquals(false, isBalanced(s));
    }

    @Test
    public void testFourUnbalanced() {
        String s = "([)]";

        assertEquals(false, isBalanced(s));
    }

    @Test
    public void testMultipleBalanced() {
        String s = "((({{{[[(())]]}}})))";

        assertEquals(true, isBalanced(s));
    }

    @Test
    public void testMultipleUnbalanced() {
        String s = "((({{{[[(())]]}})))";

        assertEquals(false, isBalanced(s));
    }

    @Test
    public void testUnsupportedChar() {
        String s = "(ll)";

        assertEquals(false, isBalanced(s));
    }
}
