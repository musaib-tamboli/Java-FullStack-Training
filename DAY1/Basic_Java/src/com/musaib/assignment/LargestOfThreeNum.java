package com.musaib.assignment;

public class LargestOfThreeNum
{
    public static void main(String[] args) {
        int a=12;
        int b =180;
        int c =100;
        if (a>b && a>c)
        {
            System.out.println(a+" is Greater Than "+b+" & "+c);
        }
        else if (b>a && b>c)
        {
            System.out.println(b+" is Greater Than "+a+" & "+c);
        }
        else
        {
            System.out.println(c+" is Greater Than "+a+" & "+b);
        }
    }
}
