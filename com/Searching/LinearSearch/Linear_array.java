package com.Searching.LinearSearch;

public class Linear_array {
    public static void main(String[] args) {
        int[] arr = {3,6,1,7,4,12,45,33};
        int key = 6;
        System.out.println(key+ " was found at index "+ linearSearch(arr,key));
    }

    public static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
