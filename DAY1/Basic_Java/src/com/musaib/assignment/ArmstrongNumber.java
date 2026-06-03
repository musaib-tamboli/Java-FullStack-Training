package com.musaib.assignment;

public class ArmstrongNumber
{
    public static void main(String[] args) {
        int n = 370;
        int original = n;
        int sum=0;
        while(n > 0)
        {
            int digit = n%10;
            sum += digit * digit * digit;
            n /=10;
        }
        if (sum == original)
        {
            System.out.println("Number is Armstronng");
        }
        else
        {
            System.out.println("Number is Not Armstrong");
        }
    }
}
