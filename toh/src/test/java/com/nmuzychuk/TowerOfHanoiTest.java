package com.nmuzychuk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Stack;

public class TowerOfHanoiTest {
    @Test
    public void testSolveThreeDisks() {
        Stack<Integer> source = new Stack<Integer>();
        Stack<Integer> extra = new Stack<Integer>();
        Stack<Integer> target = new Stack<Integer>();

        final int disks = 3;

        for (int i = disks; i > 0; i--) {
            source.push(i);
        }

        final int sourceSize = source.size();
        final String sourceToString = source.toString();

        TowerOfHanoi.solve(source, extra, target);

        assertTrue(source.isEmpty());
        assertFalse(target.isEmpty());
        assertEquals(sourceSize, target.size());
        assertEquals(sourceToString, target.toString());
    }
}
