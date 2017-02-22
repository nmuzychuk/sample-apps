package com.nmuzychuk;

import java.util.Arrays;

public final class Anagram {
    private Anagram() {
    }

    public static boolean isAnagram(final String s1, final String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }
}
