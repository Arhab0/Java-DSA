package com.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,4,10,8,3,1};
        System.out.println("unsorted array " + Arrays.toString(arr));

        for(int i = 0;i<arr.length-1;i++)
        {
            int min = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            if(arr[i] != arr[min])
            {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("sorted array " + Arrays.toString(arr));
    }
}
