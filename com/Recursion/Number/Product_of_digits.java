package com.Recursion.Number;

public class Product_of_digits {
    public static void main(String[] args) {
        System.out.println(product(505));
    }

    static int product(int n)
    {
        if(n <= 0)
        {
            return 1;
        }
        return (n%10) * product(n/10);
    }
}
