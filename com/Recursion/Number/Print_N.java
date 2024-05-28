package com.Recursion.Number;

public class Print_N {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n)
    {
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        print(n+1);
        System.out.println(n);
    }
}
