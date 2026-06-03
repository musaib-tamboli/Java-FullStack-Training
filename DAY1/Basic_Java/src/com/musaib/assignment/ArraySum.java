package com.musaib.assignment;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
       /* for (int i =0;i< arr.length;i++)
        {
            sum += arr[i];
        }*/
//        Using For each loop
        for (int num : arr)
        {
            sum += num;
        }
        System.out.println("Sum of Array :: "+sum);
    }
}
