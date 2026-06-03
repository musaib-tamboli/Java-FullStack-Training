package com.musaib.assignment;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for (int num : arr)
        {
            sum += num;
        }
        double average =(double) sum / arr.length;
        System.out.println("Average OF Array :: "+average);
    }
}
