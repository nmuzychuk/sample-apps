package com.nmuzychuk;

public final class TimesTable {

    private TimesTable() {
    }

    public static void printTable(final int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(getRow(i, times));
        }
    }

    public static String getRow(final int number, final int times) {
        StringBuilder row = new StringBuilder();

        for (int i = 1; i <= times; i++) {
            row.append(String.format("%2d ", i * number));
        }

        return row.toString();
    }

}
