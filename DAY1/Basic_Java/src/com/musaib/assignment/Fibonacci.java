package com.musaib.assignment;

public class Fibonacci {
    public int fib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }

        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i <= n; i++) {
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
        return second;
    }
    public static void main(String[] args) {
    Fibonacci f = new Fibonacci();
    f.fib(10);
    }
}
