package com.nmuzychuk;

import org.junit.Test;

import static com.nmuzychuk.LeapYear.test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void testLeapYear() {

        final int[] leapYears = {2000, 2012, 2400};
        final int[] years = {2001, 2100, 2200};

        for (int year : leapYears) {
            assertTrue(test(year));
        }

        for (int year : years) {
            assertFalse(test(year));
        }
    }

}
