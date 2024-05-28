package com.Recursion.Number;

public class Sum_of_N {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return n + sum(n-1);
    }
}
