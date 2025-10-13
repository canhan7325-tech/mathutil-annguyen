package com.annguyen;

import com.annguyen.mathutil.core.MathUtillity;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    testFactorialGivenRightArg0RunsWell();
    testFactorialGivenRightArg5RunsWell();
        testFactorialGivenRightArg6RunsWell();
        testFactorialGivenWrongArgMinus5ThrowsException();
    }

    //Test case #1: Check/Verify getfactorial() method with valid parameter , e.g, n=0
    //STEPS/PROCEDURE
    // 1.given a valid n,e.g, n=0
    // 2. call/invoke getFactorial(n=0)
    //3. Excute
    //EXPECTED VALUE
    //the  method will return as the result of 0!
    public static void testFactorialGivenRightArg0RunsWell(){
        int n=0;
        long expectedValue =1; // hope to see 0!=1, ki vong chay
        // gioi han de xem actual
        long actualValue = MathUtillity.getFactorial(n);
        //test ne, so sanh actual vs expected
        //dung bien boolean hoac in ra
        System.out.println("0! expected "+ expectedValue);
        System.out.printf("0! actual " + actualValue);
    }
    //Test case #2: Check/Verify getfactorial() method with valid parameter , e.g, n=5
    //STEPS/PROCEDURE
    // 1.given a valid n,e.g, n=5
    // 2. call/invoke getFactorial(n=5)
    //3. Excute
    //EXPECTED VALUE
    //the  method will return as the result of 5!
    public static void testFactorialGivenRightArg5RunsWell(){
        int n=5;
        long expectedValue5 =120; // hope to see 5!=120, ki vong chay
        // gioi han de xem actual
        long actualValue5 = MathUtillity.getFactorial(n);
        //test ne, so sanh actual vs expected
        //dung bien boolean hoac in ra
        System.out.println("5! expected "+ expectedValue5);
        System.out.printf("5! actual " + actualValue5);
    }
    //Test case #3: Check/Verify getfactorial() method with valid parameter , e.g, n=6
    //STEPS/PROCEDURE
    // 1.given a valid n,e.g, n=6
    // 2. call/invoke getFactorial(n=6)
    //3. Excute
    //EXPECTED VALUE
    //the  method will return as the result of 6!
    public static void testFactorialGivenRightArg6RunsWell(){
        System.out.println("6! expected =720| actual =" +MathUtillity.getFactorial(6));
    }

    //Test case #4: Check/Verify getfactorial() method with INvalid parameter , e.g, n= -5
    //STEPS/PROCEDURE
    // 1.given a valid n,e.g, n=-5
    // 2. call/invoke getFactorial(n=-5)
    //3. Excute
    //EXPECTED VALUE
    //the  method will throw an exception
    //Status
    // passed hay falied doan xem, chay app da

    public static void testFactorialGivenWrongArgMinus5ThrowsException(){
       MathUtillity.getFactorial(-5); //PASSED vi ki vong ngoai le xuat hien, va ngoai le xuat hien that
        //thay ngoai le ma passs la tinh huong t athiet ke ham sex xay ra ngoai le voi so AM GIAI THUA
    }
}