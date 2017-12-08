package com.nmuzychuk;

public final class IntegerReverser {

    private IntegerReverser() {
    }

    public static int reverse(final int number) {
        int input = number;
        int result = 0;

        while (input != 0) {
            int reminder = input % 10;
            result = result * 10 + reminder;
            input = input / 10;
        }

        return result;
    }

}
