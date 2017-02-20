package com.nmuzychuk;

public final class Rle {
    private Rle() {
    }

    public static String encode(final String s) {
        StringBuilder encoded = new StringBuilder();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                encoded.append(count);
                encoded.append(s.charAt(i));
                count = 1;
            }
        }
        return encoded.toString();
    }

    public static String decode(final String s) {
        StringBuilder decoded = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9') {
                digits.append(c);
            } else {
                int count = Integer.parseInt(digits.toString());

                for (int j = 0; j < count; j++) {
                    decoded.append(c);
                }
                digits.setLength(0);
            }
        }
        return decoded.toString();
    }
}
