package com.Recursion.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 6;
//        System.out.println(find(arr,target,0));
        System.out.println(findIndex(arr,target,0));
    }

    static boolean find(int[] arr, int target,int i)
    {
        if(i == arr.length)
        {
            return false;
        }
        return arr[i] == target || find(arr,target,i+1);
    }

    static int findIndex(int[] arr, int target, int i)
    {
        if(i == arr.length)
        {
            return -1;
        }
        if(arr[i] == target)
        {
            return i;
        }
        return findIndex(arr,target,i+1);
    }
}
