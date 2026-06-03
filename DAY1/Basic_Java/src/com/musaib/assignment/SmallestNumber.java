package com.musaib.assignment;

public class SmallestNumber {


        public static void main(String[] args) {
            int[] arr = {1000,20,45,2520,1100,100};
            int small = arr[0];
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i] < small)
                {
                    small =arr[i];
                }
            }
            System.out.println("Smallest Element from Array is ::  "+ small);

        }
    }


