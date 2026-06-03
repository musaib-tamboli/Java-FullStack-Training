package com.musaib.assignment;

public class SumNaturalNumber {
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        for (int i = 1;i<=n;i++)
        {
            sum +=i;
        }
        System.out.println("Sum of First "+ n+" natural numbers = "+sum);
    }
}
