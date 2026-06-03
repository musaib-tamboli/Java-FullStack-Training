package com.musaib.assignment;

public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int x = a, y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }
}
