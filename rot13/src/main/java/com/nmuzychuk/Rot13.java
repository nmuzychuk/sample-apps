package com.nmuzychuk;

public final class Rot13 {
    private Rot13() {
    }

    public static String rotate(final String s) {
        char[] chars = s.toCharArray();
        char[] rotated = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                if (c <= 'm') {
                    c += 13;
                } else {
                    c -= 13;
                }
            }
            if (c >= 'A' && c <= 'Z') {
                if (c <= 'M') {
                    c += 13;
                } else {
                    c -= 13;
                }
            }
            rotated[i] = c;
        }

        return new String(rotated);
    }
}
