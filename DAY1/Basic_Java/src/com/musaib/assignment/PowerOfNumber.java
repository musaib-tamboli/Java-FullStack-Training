package com.musaib.assignment;

public class PowerOfNumber {
    public static int powNum(int base,int exponent)
    {
         base = 2;
         exponent = 5;
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
     int res = powNum(2,5);
        System.out.println("Result = " + res);
    }
}
