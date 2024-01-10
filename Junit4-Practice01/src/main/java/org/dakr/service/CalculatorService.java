package org.dakr.service;

import java.util.Arrays;

public class CalculatorService {

    public static int addTwoNumbers(int a,int b){
        return a+b;
    }
    public static int subtractTwoNumbers(int a,int b){
        return a-b;
    }

    public static double divideTwoNumbers(int a,int b){
        return a/b;
    }

    public static int productTwoNumbers(int a,int b){
        return a*b;
    }

    public static int sumAnyNumbers(int ...numbers){
        int s=0;
        for(int n:numbers){
            s+=n;
        }
        return s;
    }

    public static String showMsg(String name){
        return name;
    }

    public static boolean showBoolean(boolean b){
        return b;

        }


    }

