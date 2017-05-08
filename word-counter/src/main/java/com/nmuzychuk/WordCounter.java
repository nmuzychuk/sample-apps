package com.nmuzychuk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class WordCounter {
    private WordCounter() {
    }

    public static void main(final String[] args) throws java.io.IOException {
        ArrayList<String> lines = new ArrayList<String>();
        String result;
        String line;

        do {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            line = br.readLine();

            if (line != null) {
                lines.add(line);
            }
        } while (line != null);

        result = count(lines);
        System.out.println(result);
    }

    public static String count(final ArrayList<String> lines) {
        int newlineCount = 0;
        int wordCount = 0;
        int byteCount = 0;

        for (String line : lines) {
            newlineCount++;
            wordCount += line.split("\\s+").length;
            byteCount += line.length() + 1;
        }

        String template = "\t%s\t%s\t%s";
        return String.format(template, newlineCount, wordCount, byteCount);
    }
}
