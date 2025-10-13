package com.annguyen.mathutil.core.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.annguyen.mathutil.core.MathUtillity.*; // import static để gọi getFactorial() trực tiếp

class MathUtillityTest {

    // Test case #1: Check getFactorial(0)
    @Test
    void testFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expectedValue = 1; // 0! = 1
        long actualValue = getFactorial(n);

        assertEquals(expectedValue, actualValue);
        assertEquals(1, getFactorial(0));
    }

    // Test case #2: Check getFactorial(5)
    @Test
    void testFactorialGivenRightArg5RunsWell() {
        assertEquals(120, getFactorial(5)); // 5! = 120
    }

    // Test case #3: Check getFactorial(1)
    @Test
    void testFactorialGivenRightArg1RunsWell() {
        assertEquals(1, getFactorial(1)); // 1! = 1
    }

    // Test case #4: Check exception with negative number
    @Test
    void testFactorialGivenWrongArgMinus5ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));



    }
}
