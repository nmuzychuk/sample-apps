package com.nmuzychuk;

public final class LeapYear {

    private LeapYear() {
    }

    public static boolean test(final int year) {

        final int[] nYears = {4, 100, 400};

        return year % nYears[0] == 0 && year % nYears[1] != 0
                || year % nYears[2] == 0;
    }

}
