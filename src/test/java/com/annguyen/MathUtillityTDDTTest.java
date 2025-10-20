package com.annguyen;

import com.annguyen.mathutil.core.MathUtillity;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtillityTDDTTest {
    // ta chuan bi bo dta de rieng sau do fill vao
    // 1 mang 2 chieu bao gom gia tri ki vong  | con n!
    public static Object[][] initTestData() {
        Object[][] dataset = {//={cac phan tu cua mang cach nhau dau phay ,
                //15,18,20 }
                {5,120},
                {6,720},
                {4,24},
                {3,6},
                {2,2},
                {1,1},
                {0,1}} ;//[7][2]
        return dataset;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void TestFactorialGivenRightArgRunsWell(int n,long expected) {
        assertEquals(expected, MathUtillity.getFactorial(n));
    }
}