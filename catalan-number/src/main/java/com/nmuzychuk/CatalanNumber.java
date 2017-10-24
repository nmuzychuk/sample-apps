package com.nmuzychuk;

public final class CatalanNumber {

    private CatalanNumber() {
    }

    public static int ofNumber(final int n) {
        if (n <= 1) {
            return 1;
        } else {
            return 2 * (2 * n - 1) * ofNumber(n - 1) / (n + 1);
        }
    }

}
