package com.nmuzychuk;

public final class Base64 {
    private static final String BASE64_CHARS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static final String BASE64_PADDING = "=";

    private static final int BASE64_MAX = 63;

    private static final byte INPUT_STEP = 3;

    private static final byte INPUT_SHIFT_DISTANCE_G1 = 16;
    private static final byte INPUT_SHIFT_DISTANCE_G2 = 8;

    private static final byte OUTPUT_SHIFT_DISTANCE_G1 = 18;
    private static final byte OUTPUT_SHIFT_DISTANCE_G2 = 12;
    private static final byte OUTPUT_SHIFT_DISTANCE_G3 = 6;

    private Base64() {
    }

    public static String encode(final String s) {
        // input string
        StringBuilder sb = new StringBuilder(s);
        // result string
        StringBuilder rb = new StringBuilder();
        // result padding
        StringBuilder pb = new StringBuilder();

        while (sb.length() % INPUT_STEP != 0) {
            sb.append("\0");
            pb.append(BASE64_PADDING);
        }

        for (int i = 0; i < sb.length(); i += INPUT_STEP) {
            int n = 0;
            n += (sb.charAt(i) << INPUT_SHIFT_DISTANCE_G1);
            n += (sb.charAt(i + 1) << INPUT_SHIFT_DISTANCE_G2);
            n += sb.charAt(i + 2);

            int[] ns = {
                    (n >> OUTPUT_SHIFT_DISTANCE_G1) & BASE64_MAX,
                    (n >> OUTPUT_SHIFT_DISTANCE_G2) & BASE64_MAX,
                    (n >> OUTPUT_SHIFT_DISTANCE_G3) & BASE64_MAX,
                    n & BASE64_MAX
            };

            for (int cn : ns) {
                rb.append(BASE64_CHARS.charAt(cn));
            }
        }

        return rb.substring(0, rb.length() - pb.length()) + pb;
    }
}
