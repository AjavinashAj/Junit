package org.dakr.service;

import org.junit.*;

import java.util.Date;
import java.util.concurrent.Callable;

public class CalculatorServiceTest {


    //@BeforeClass ,before all test cases
    @BeforeClass
    public static void init(){
        System.out.println("Before all test case start...");
        System.out.println("start date:"+new Date());
    }

    //AfterClass ,after all test cases
    @AfterClass
    public static void cleanUp(){
        System.out.println("After all test case executed..");
        System.out.println("Time:"+new Date());


    }

    //before each test case
    @Before
    public void beforeEach(){

        System.out.println("Before each test case");

    }


    //test method to add two numbers
    @Test
    public void addTwoNumbersTest(){
        System.out.println("addtion");
        int result=CalculatorService.addTwoNumbers(34,67);

        int expected =101;
        Assert.assertEquals(expected,
                result);
        /*
        actual result
        expected result
        */

    }

    @Test
    public void subtractTwoNumbersTest(){
        System.out.println("subtraction");
        int result=CalculatorService.subtractTwoNumbers(23,12);
        int expected=11;
        Assert.assertEquals(expected ,result);
    }

    @Test
    public void productTwoNumbers(){
        System.out.println("multiplication");
        int result=CalculatorService.productTwoNumbers(23,90);
        int expected=2070;
        Assert.assertEquals(expected,result);
    }
    @Test
    public void sumAnyNumbersTest(){
        System.out.println("sum of variable data type");
        int result=CalculatorService.sumAnyNumbers(34,56,78,90,90);
            int expected=348;
            Assert.assertEquals(expected,result);

            }

            @Test
            public void showMsgTest(){
                System.out.println("show message");
              String result =CalculatorService.showMsg("avinash");
              String expected="avinash";
              Assert.assertEquals(expected,result);
            }

            @Test
            public void showBooleanTest(){
                System.out.println("show boolean method");
              boolean result= CalculatorService.showBoolean(true);
              Assert.assertTrue(result);
            // Assert.assertFalse(result);
            }

}
