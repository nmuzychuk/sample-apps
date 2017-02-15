package com.nmuzychuk;

import java.util.HashMap;
import java.util.Stack;

class BalancedParentheses {
    static boolean isBalanced(String s) {
        HashMap<Character, Character> m = new HashMap<Character, Character>();
        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            boolean isLeftParen = m.get(c) == null;

            if (isLeftParen) {
                stack.push(c);
            } else {
                if (!stack.isEmpty() && m.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
