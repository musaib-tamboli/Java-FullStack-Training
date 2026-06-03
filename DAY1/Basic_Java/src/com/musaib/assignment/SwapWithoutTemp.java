package com.musaib.assignment;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 101;
        int b = 20;
        System.out.println("Before Swaping ");
        System.out.println("a = "+a+" b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swaping ");
        System.out.println("a = "+a+" b = "+b);

    }
}