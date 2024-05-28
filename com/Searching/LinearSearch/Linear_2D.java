package com.Searching.LinearSearch;

import java.util.Arrays;

public class Linear_2D {
    public static void main(String[] args) {
        int[][] arr = {
                {4,5,6,7,3},
                {1,2,34,56,67},
                {23,47,87},
                {98,103,20},
        };
        int target = 2;
        int[] ans = linearSearch(arr,target);
        if(ans[0] == -1)
        {
            System.out.println("target not found");
        } else{
            System.out.println("target was found at index " + Arrays.toString(ans));
        }
    }

    public static int[] linearSearch(int[][] arr , int target)
    {
        if(arr.length == 0)
        {
            return new int[] {-1,-1};
        }

        for(int row = 0; row<arr.length ; row++)
        {
            for (int col = 0; col<arr[row].length ; col++)
            {
                if(arr[row][col] == target)
                {
                    return  new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
