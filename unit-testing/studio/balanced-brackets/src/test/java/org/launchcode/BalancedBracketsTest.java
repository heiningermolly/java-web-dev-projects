package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.launchcode.BalancedBrackets.hasBalancedBrackets;

class BalancedBracketsTest {
    //TODO: add tests here
    // there should be 12 tests
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void nothingButBrackets() {
        String str = "[]";
        assertEquals(hasBalancedBrackets(str), true);
    }

    @Test
    public void noBrackets()  {
        String str = "Hello Sunshine!";
        assertEquals(hasBalancedBrackets(str), true);
    }

    @Test
    public void outsideBrackets() {
        String str = "[Hello]";
        assertTrue(hasBalancedBrackets(str));
    }

    @Test
    public void insideBrackets() {
        String str = "Hel[]lo";
        assertTrue(hasBalancedBrackets(str));
    }

    @Test
    public void multipleBrackets() {
        String str = "[He][lo]";
        assertTrue(hasBalancedBrackets(str));
    }

    @Test
    public void nestedBrackets() {
        String str = "[H[el]o]";
        assertTrue(hasBalancedBrackets(str));
    }

    @Test
    public void tooManyOpeningBrackets() {
        String str = "[[Hello]";
        assertFalse(hasBalancedBrackets(str));
    }


    @Test
    public void tooManyClosingBrackets() {
        String str = "[Hello]]";
        assertFalse(hasBalancedBrackets(str));
    }

    @Test
    public void onlyOneBracket(){
        String str = "[";
        String str2 = "]";
        assertFalse(hasBalancedBrackets(str));
        assertFalse(hasBalancedBrackets(str2));
    }

    @Test
    public void insideOutBrackets(){
        String str = "][";
        assertFalse(hasBalancedBrackets(str));
    }



}