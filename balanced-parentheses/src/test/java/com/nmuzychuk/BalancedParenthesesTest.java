package com.nmuzychuk;

import static com.nmuzychuk.BalancedParentheses.isBalanced;

import junit.framework.TestCase;

public class BalancedParenthesesTest extends TestCase {
    public void testEmpty() {
        String s = "";

        assertEquals(true, isBalanced(s));
    }

    public void testOneChar() {
        String s = "(";

        assertEquals(false, isBalanced(s));
    }

    public void testTwoBalanced() {
        String s = "()";

        assertEquals(true, isBalanced(s));
    }

    public void testTwoUnbalanced() {
        String s = "((";

        assertEquals(false, isBalanced(s));
    }

    public void testFourUnbalanced() {
        String s = "([)]";

        assertEquals(false, isBalanced(s));
    }

    public void testMultipleBalanced() {
        String s = "((({{{[[(())]]}}})))";

        assertEquals(true, isBalanced(s));
    }

    public void testMultipleUnbalanced() {
        String s = "((({{{[[(())]]}})))";

        assertEquals(false, isBalanced(s));
    }

    public void testUnsupportedChar() {
        String s = "(ll)";

        assertEquals(false, isBalanced(s));
    }
}
