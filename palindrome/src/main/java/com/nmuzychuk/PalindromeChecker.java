package com.nmuzychuk;

import static java.lang.Character.toLowerCase;

public final class PalindromeChecker {

    private PalindromeChecker() {
    }

    public static boolean isPalindrome(final String s) {
        int i = 0;
        int j = s.length() - 1;

        while (toLowerCase(s.charAt(i)) < toLowerCase(s.charAt(j))) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
