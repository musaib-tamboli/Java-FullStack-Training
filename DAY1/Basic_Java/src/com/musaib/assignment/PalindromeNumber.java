package com.musaib.assignment;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num=8008;
        int n = num;
        int reverse= 0;
        while(num>0)
        {
            int digit = num % 10;
            reverse= reverse * 10 + digit;
            num = num / 10;
        }
        if(n == reverse)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }
    }
}
