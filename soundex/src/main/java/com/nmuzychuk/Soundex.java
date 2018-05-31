package com.nmuzychuk;

public final class Soundex {
    private Soundex() {
    }

    public static String compute(final String name) {
        StringBuilder result = new StringBuilder();
        result.append(name.toUpperCase().charAt(0));

        String current = name.substring(1);
        current = current.replaceAll("[aeiouyhw]", "");
        current = current.replaceAll("[bfpv]", "1");
        current = current.replaceAll("[cgjkqsxz]", "2");
        current = current.replaceAll("[dt]", "3");
        current = current.replaceAll("l", "4");
        current = current.replaceAll("[mn]", "5");
        current = current.replaceAll("r", "6");
        result.append(current.substring(0, 3));

        return result.toString();
    }
}
