package com.nmuzychuk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.nmuzychuk.TimesTable.printTable;
import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.TimesTable.getRow;

public class TimesTableTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() {
        System.setOut(null);
    }

    @Test
    public void testRow() {
        assertEquals(" 1  2  3  4  5 ", getRow(1, 5));
    }

    @Test
    public void testTable() {
        printTable(3);

        assertEquals(" 1  2  3 \n 2  4  6 \n 3  6  9 \n", out.toString());
    }

}
