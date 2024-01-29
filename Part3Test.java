/*
 * Part3Test.java
 * This file provides tests for the visualInt method of Assignment 1, Part 3 of AUCSC 112.
 *
 * By R. Heise
 * 27 January 2024
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Part3Test {

    @Test
    public void testVisualInt_123456() {
        System.out.println("visualInt on 123456");
        int num = 123456;
        String expResult = "* ** *** **** ***** ******";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_4() {
        System.out.println("visualInt on 4");
        int num = 4;
        String expResult = "****";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_Neg85() {
        System.out.println("visualInt on -85");
        int num = -85;
        String expResult = "-******** *****";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_Neg102() {
        System.out.println("visualInt on -102");
        int num = -102;
        String expResult = "-* _ **";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_0() {
        System.out.println("visualInt on 0");
        int num = 0;
        String expResult = "_";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_90() {
        System.out.println("visualInt on 90");
        int num = 90;
        String expResult = "********* _";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_Neg90() {
        System.out.println("visualInt on -90");
        int num = -90;
        String expResult = "-********* _";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_LotsZeroIncludingEnd() {
        System.out.println("visualInt on 100,000,000");
        int num = 100000000;
        String expResult = "* _ _ _ _ _ _ _ _";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_LotsZeroNotEnd() {
        System.out.println("visualInt on 20050006");
        int num = 20050006;
        String expResult = "** _ _ ***** _ _ _ ******";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_RandNeg() {
        System.out.println("visualInt on -1040067239");
        int num = -1040067239;
        String expResult = "-* _ **** _ _ ****** ******* ** *** *********";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_MaxInt() {
        System.out.println("visualInt on max int");
        int num = Integer.MAX_VALUE; //2147483647
        String expResult = "** * **** ******* **** ******** *** ****** **** *******";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_MaxIntLess1() {
        System.out.println("visualInt on max int less 1");
        int num = Integer.MAX_VALUE - 1; //2147483646
        String expResult = "** * **** ******* **** ******** *** ****** **** ******";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_MinInt() {
        System.out.println("visualInt on min int");
        int num = Integer.MIN_VALUE; //-2147483648
        String expResult = "-** * **** ******* **** ******** *** ****** **** ********";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testVisualInt_MinIntGreater1() {
        System.out.println("visualInt on min int plus 1");
        int num = Integer.MIN_VALUE + 1; //-2147483647
        String expResult = "-** * **** ******* **** ******** *** ****** **** *******";
        String result = Part3.visualInt(num);
        assertEquals(expResult, result);
    }
}//class
