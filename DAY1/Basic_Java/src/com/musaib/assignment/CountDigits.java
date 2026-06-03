package com.musaib.assignment;

public class CountDigits {
    public static void main(String[] args) {
        int n = 13456;
        int count =0;
        while (n>0)
        {
            count++;
            n /=10;
        }
        System.out.println("Digits Are : "+count);
    }
}
