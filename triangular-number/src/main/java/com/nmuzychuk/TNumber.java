package com.nmuzychuk;

public final class TNumber {
    private TNumber() {
    }

    public static int tNumberLoop(final int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int tNumberRec(final int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + tNumberRec(n - 1));
        }
    }
}
