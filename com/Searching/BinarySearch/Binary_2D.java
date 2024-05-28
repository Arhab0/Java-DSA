package com.Searching.BinarySearch;

import java.util.Arrays;

public class Binary_2D {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 5;
        System.out.println(Arrays.toString(binary_2d(matrix,target)));
    }

    public static int[] binary_2d (int[][] matrix, int target)
    {
        if(matrix.length == 0)
        {
            return new int[] {-1,-1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int cMid = cols/2;

        if(rows == 1)
        {
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rStart = 0;
        int rEnd = rows -1;

        // reducing the matrix
        while(rStart < (rEnd -1))
        {
            int mid = (rEnd + rStart)/2;
            if(matrix[mid][cMid] == target)
            {
                return new int[] {mid,cMid};
            } else if(matrix[mid][cMid] > target){
                rEnd = mid;
            } else{
                rStart = mid;
            }
        }

        // now we have 2 rows remaining
        // checking whether the target is in the col of 2
        if(matrix[rStart][cMid] == target)
        {
            return new int[] {rStart,cMid};
        }

        // search in 1st half
        if(matrix[rStart][cMid-1] >= target)
        {
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        // search in 2nd half
        else if(matrix[rStart][cMid + 1] >= target && target <= matrix[rStart][cols -1])
        {
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // search in 3rd half
        else if(matrix[rStart+1][cMid-1] >= target)
        {
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        // search in 4th half
        else{
            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
        }

    }

    public static int[] binarySearch(int[][] matrix,int row,int cStart, int cEnd, int target)
    {
        while(cStart <= cEnd)
        {
            int mid = (cEnd + cStart) /2;
            if(matrix[row][mid] == target)
            {
                return new int[] {row,mid};
            }else if(matrix[row][mid] < target){
                cStart = mid + 1;
            } else{
                cEnd = mid -1;
            }
        }

        return new int[] {-1,-1};
    }
}
