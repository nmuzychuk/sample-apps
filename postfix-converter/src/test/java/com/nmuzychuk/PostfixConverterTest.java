package com.nmuzychuk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.nmuzychuk.PostfixConverter.convertToInfix;
import static com.nmuzychuk.PostfixConverter.convertToPostfix;

public class PostfixConverterTest {
    @Test
    public void testPostfixAPlusB() {
        assertEquals("AB+", convertToPostfix("A+B"));
    }

    @Test
    public void testPostfixAPlusBMinusC() {
        assertEquals("AB+C-", convertToPostfix("A+B-C"));
    }

    @Test
    public void testPostfixAPlusTimesC() {
        assertEquals("ABC*+", convertToPostfix("A+B*C"));
    }

    @Test
    public void testPostfixATimesBPlusC() {
        assertEquals("ABC+*", convertToPostfix("A*(B+C)"));
    }

    @Test
    public void testPostfixComplex1() {
        assertEquals("ABCDA*-*+",
                convertToPostfix("A+B*(C-D*A)"));
    }

    @Test
    public void testPostfixComplex2() {
        assertEquals("AB+CD-*",
                convertToPostfix("(A+B)*(C-D)"));
    }

    @Test
    public void testPostfixComplex3() {
        assertEquals("AB+BC+/D*",
                convertToPostfix("((A+B)/(B+C))*D"));
    }

    @Test
    public void testPostfixComplex4() {
        assertEquals("AB+C*D+",
                convertToPostfix("((A+B)*C)+D"));
    }

    @Test
    public void testInfixCase1() {
        final int expResult = 4;
        assertEquals(expResult, convertToInfix("22+"));
    }

    @Test
    public void testInfixCase2() {
        final int expResult = 2;
        assertEquals(expResult, convertToInfix("75-"));
    }

    @Test
    public void testInfixCase3() {
        final int expResult = 11;
        assertEquals(expResult, convertToInfix("532*+"));
    }

    @Test
    public void testInfixCase4() {
        final int expResult = 24;
        assertEquals(expResult, convertToInfix("53+9*3/"));
    }

    @Test
    public void testInfixCase5() {
        final int expResult = 27;
        assertEquals(expResult, convertToInfix("93*2+42/-"));
    }
}
