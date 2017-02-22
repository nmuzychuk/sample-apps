package com.nmuzychuk;

public final class Factorial {
    private Factorial() {
    }

    public static int factorialLoop(final int n) {
        if (n == 0) {
            return 1;
        } else {
            int product = 1;

            for (int i = 1; i <= n; i++) {
                product *= i;
            }

            return product;
        }
    }

    public static int factorialRec(final int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialRec(n - 1));
        }
    }
}
