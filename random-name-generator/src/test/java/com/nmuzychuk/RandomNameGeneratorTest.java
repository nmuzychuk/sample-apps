package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RandomNameGeneratorTest {
    @Test
    public void testGetName() {
        final String regexp = "[a-z]*_[a-z]*";
        final String name = RandomNameGenerator.getName();

        assertFalse(name.isEmpty());
        assertTrue(name.matches(regexp));
    }
}
