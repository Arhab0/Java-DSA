package com.Searching.BinarySearch;

public class Binary {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,7,8,9,10,11,22,33,44,55};
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 6;
//        System.out.println(BinarySearch(arr,target));
        System.out.println(orderAgnosticBS(arr,target));
    }

    public static int BinarySearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        int s = 0;
        int e = arr.length-1;

        while(s<=e) {
            int mid = (e + s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static int orderAgnosticBS(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return  -1;
        }

        int s = 0;
        int e = arr.length-1;

        boolean isAsc = arr[s] < arr[e];

        while(s<=e)
        {
            int mid = (e+s)/2;

            if(arr[mid]== target)
            {
                return mid;
            }
            if(isAsc)
            {
                if(arr[mid] < target)
                {
                    s = mid+1;
                } else{
                    e = mid -1;
                }
            } else{
                if(arr[mid] > target)
                {
                    s = mid+1;
                } else{
                    e = mid -1;
                }
            }
        }
        return -1;
    }
}
