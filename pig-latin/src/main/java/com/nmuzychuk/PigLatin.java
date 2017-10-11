package com.nmuzychuk;

import java.util.Arrays;
import java.util.List;

public final class PigLatin {

    private PigLatin() {
    }

    private static List<Character> vowels =
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public static String alter(final String string) {

        StringBuilder result = new StringBuilder();

        int firstVowelIndex = -1;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (vowels.contains(c)) {
                firstVowelIndex = i;
                break;
            }
        }

        result.append(string.substring(firstVowelIndex, string.length()));
        result.append(string.substring(0, firstVowelIndex));
        result.append("ay");

        return result.toString();
    }

}
