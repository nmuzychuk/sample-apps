package com.nmuzychuk;

import java.util.TreeMap;

public final class LFCounter {
    private LFCounter() {
    }

    public static String getCount(final String s) {
        TreeMap<Character, Integer> chars = new TreeMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                count(chars, Character.toLowerCase(c));
            }
        }

        return chars.toString();
    }

    private static void count(final TreeMap<Character, Integer> chars,
                              final char c) {
        Integer value = chars.get(c);

        if (value != null) {
            chars.put(c, ++value);
        } else {
            chars.put(c, 1);
        }
    }
}
