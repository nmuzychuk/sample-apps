package com.nmuzychuk;

import java.util.Stack;

public final class PostfixConverter {
    private PostfixConverter() {
    }

    public static String convertToPostfix(final String s) {
        Stack<Character> stack = new Stack<Character>();
        String postfix = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOperand(c)) {
                postfix += c;
            } else {
                switch (c) {
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        while (!stack.isEmpty()) {
                            if (stack.peek() == '(') {
                                stack.pop();
                                break;
                            } else {
                                postfix += stack.pop();
                            }
                        }
                        break;
                    default:
                        if (stack.isEmpty() || prec(stack.peek()) < prec(c)) {
                            stack.push(c);
                        } else {
                            char operator = stack.pop();
                            if (operator != '(') {
                                postfix += operator;
                            }
                            stack.push(c);
                        }
                }
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }

    public static int convertToInfix(final String s) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isOperand(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int op2 = stack.pop();
                int op1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                    default:
                        break;
                }
            }
        }

        return stack.pop();
    }

    private static boolean isOperand(final char c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '(':
            case ')':
                return false;
            default:
                return true;
        }
    }

    private static int prec(final char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 1;
        }
    }
}
