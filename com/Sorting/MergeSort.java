package com.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr)+ " before sorting");
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr) + " after sorting");
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return Merge(left,right);
    }

    public static int[] Merge(int[] left, int[] right)
    {
        int[] ans = new int[left.length + right.length];
        int i = 0,j=0,k=0;

        while(i<left.length && j<right.length)
        {
            if(left[i] < right[j])
            {
                ans[k] = left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<left.length)
        {
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            ans[k] = right[j];
            j++;
            k++;
        }

        return ans;
    }
}
