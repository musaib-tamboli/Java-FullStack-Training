package com.musaib.assignment;

public class SwapUsingTemp
{
    public static void main(String[] args) {
        int a = 12;
        int b = 17;
        int temp;
        System.out.println("Before Swaping ");
        System.out.println("a = "+a+" b = "+b);

        temp = a;
        a =b;
        b = temp;
        System.out.println("After Swaping ");
        System.out.println("a = "+a+" b = "+b);

    }
}
