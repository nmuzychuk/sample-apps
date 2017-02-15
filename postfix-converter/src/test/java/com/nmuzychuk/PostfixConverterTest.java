package com.nmuzychuk;

import junit.framework.TestCase;

public class PostfixConverterTest
        extends TestCase {

    public void testPostfixAPlusB() {
        assertEquals("AB+", PostfixConverter.convertToPostfix("A+B"));
    }

    public void testPostfixAPlusBMinusC() {
        assertEquals("AB+C-", PostfixConverter.convertToPostfix("A+B-C"));
    }

    public void testPostfixAPlusTimesC() {
        assertEquals("ABC*+", PostfixConverter.convertToPostfix("A+B*C"));
    }

    public void testPostfixATimesBPlusC() {
        assertEquals("ABC+*", PostfixConverter.convertToPostfix("A*(B+C)"));
    }

    public void testPostfixComplex1() {
        assertEquals("ABCDA*-*+", PostfixConverter.convertToPostfix("A+B*(C-D*A)"));
    }

    public void testPostfixComplex2() {
        assertEquals("AB+CD-*", PostfixConverter.convertToPostfix("(A+B)*(C-D)"));
    }

    public void testPostfixComplex3() {
        assertEquals("AB+BC+/D*", PostfixConverter.convertToPostfix("((A+B)/(B+C))*D"));
    }

    public void testPostfixComplex4() {
        assertEquals("AB+C*D+", PostfixConverter.convertToPostfix("((A+B)*C)+D"));
    }

    public void testInfixCase1() {
        assertEquals(4, PostfixConverter.convertToInfix("22+"));
    }

    public void testInfixCase2() {
        assertEquals(2, PostfixConverter.convertToInfix("75-"));
    }

    public void testInfixCase3() {
        assertEquals(11, PostfixConverter.convertToInfix("532*+"));
    }

    public void testInfixCase4() {
        assertEquals(24, PostfixConverter.convertToInfix("53+9*3/"));
    }

    public void testInfixCase5() {
        assertEquals(27, PostfixConverter.convertToInfix("93*2+42/-"));
    }
}
