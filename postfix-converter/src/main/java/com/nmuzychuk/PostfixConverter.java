package com.nmuzychuk;

import java.util.Stack;

class PostfixConverter {
    static String convertToPostfix(String s) {
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
                        if (stack.isEmpty() || precedence(stack.peek()) < precedence(c)) {
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

    static int convertToInfix(String s) {
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
                }
            }
        }

        return stack.pop();
    }

    private static boolean isOperand(char c) {
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

    private static int precedence(char c) {
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
