package com.Recursion.Arrays;

import java.util.ArrayList;

public class Multiple_occurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        int target = 4;
        System.out.println(find(arr, target, 0, new ArrayList<Integer>()));
    }

    static ArrayList<Integer> find(int[] arr, int target, int i, ArrayList<Integer> list)
    {
        if(i == arr.length)
        {
            return list;
        }
        if(arr[i] == target)
        {
            list.add(i);
        }
        return find(arr,target,i+1,list);
    }


    // not good approuch
    static ArrayList<Integer> returnList (int[] arr, int target,int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length-1)
        {
            return list;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowFunctionCalls = returnList(arr,target,index+1);
        list.addAll(ansFromBelowFunctionCalls);

        return list;
    }
}
