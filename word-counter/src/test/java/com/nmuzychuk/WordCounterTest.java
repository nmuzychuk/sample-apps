package com.nmuzychuk;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.WordCounter.count;

public class WordCounterTest {
    @Test
    public void testOneWord() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("foo");

        assertEquals("\t1\t1\t4", count(list));
    }

    @Test
    public void testTwoWordsOneLine() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("foo bar");

        assertEquals("\t1\t2\t8", count(list));
    }

    @Test
    public void testTwoWordsTwoLines() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("foo");
        list.add("bar");

        assertEquals("\t2\t2\t8", count(list));
    }

    @Test
    public void testThreeWordsTwoLines() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("foo bar");
        list.add("baz");

        assertEquals("\t2\t3\t12", count(list));
    }
}
