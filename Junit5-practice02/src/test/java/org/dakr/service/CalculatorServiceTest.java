package org.dakr.service;

import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceTest {

    @BeforeAll
    public static void beforeClassTest(){
        System.out.println("Before all test case executed...");
        System.out.println("Before class :"+new Date());
    }
    @AfterAll
    public static void afterClassTest(){
        System.out.println("After all test case excecuted....");
        System.out.println("After class:"+new Date());
    }
    @BeforeEach
    public  void beforEachTest(){
        System.out.println("Before each test method exceuted...:"+new Date());
    }
    @AfterEach
    public  void afterEachTest(){
        System.out.println("After each test method executed...:"+new Date());
    }
    @DisplayName(value = "Sum")
    @Test
    public void  sumofTwoNumberTest(){
        System.out.println("sum of two number...");
        int result=CalculatorService.sumofTwoNumber(23,67);
        int expected=90;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void sbutractionOfTwoNumberTest(){
        System.out.println("subtration of number..");
        int result=CalculatorService.subtractionOfTwoNumber(23,7);
        int expected=16;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void productOfNumberTest(){
        System.out.println("multiplication of number....");
        int result=CalculatorService.productOfNumber(23,89);
        int expected=2047;
        Assertions.assertEquals(expected,result);
    }

    @Test

    public void divOfNumbeTest(){
        System.out.println("division of number....");
        double result=CalculatorService.divOfNumber(45,6);
        int expected=7;
        Assertions.assertEquals(expected,result);
    }
}
