package com.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {15,16,6,5,1};
        System.out.println("unsorted array "+ Arrays.toString(arr));
        int i;
        for(i = 0; i<arr.length-1;i++)
        {
            boolean flag = false;
            for(int j = 0; j < arr.length-1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
        System.out.println("sorted array "+ Arrays.toString(arr) + " total passes " + i);
    }
}
