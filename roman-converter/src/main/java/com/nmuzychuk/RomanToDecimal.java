package com.nmuzychuk;

import java.util.HashMap;
import java.util.Map;

public final class RomanToDecimal {

    private RomanToDecimal() {
    }

    private static final Map<Character, Integer> MAP = new HashMap<>();

    static {
        MAP.put('I', 1);
        MAP.put('V', 5);
        MAP.put('X', 10);
        MAP.put('L', 50);
        MAP.put('C', 100);
        MAP.put('D', 500);
        MAP.put('M', 1000);
    }

    public static int convert(final String s) {
        int l = s.length();
        int sum = MAP.get(s.charAt(l - 1));

        for (int i = l - 2; i >= 0; i--) {
            if (MAP.get(s.charAt(i + 1)) > MAP.get(s.charAt(i))) {
                sum -= MAP.get(s.charAt(i));
            } else {
                sum += MAP.get(s.charAt(i));
            }
        }

        return sum;
    }

}
