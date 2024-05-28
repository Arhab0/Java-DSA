package com.Recursion.Intro_to_recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int s = 0, e = arr.length-1 , target = 14;

        System.out.println(binarySearch(arr,target,s,e));
    }

    static int binarySearch(int[] arr, int target, int s, int e)
    {
        if(s>e)
        {
            return -1;
        }

        int m = (e+s)/2;

        if(arr[m] == target)
        {
            return m;
        }

        if(arr[m] > target)
        {
            return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr,target,m+1,e);
    }
}
