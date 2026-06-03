package com.musaib.assignment;

public class GCD {
    public static void main(String[] args) {
        int a = 24, b = 36;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD = " + a);
    }
}
