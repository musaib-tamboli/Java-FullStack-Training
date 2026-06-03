package com.musaib.assignment;

public class LargestElement
{
    public static void main(String[] args) {
        int[] arr = {1,20,45,2520,1100,100};
        int large = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > large)
            {
                large =arr[i];
            }
        }
        System.out.println("Largest Element from Array is ::  "+ large);

    }
}
