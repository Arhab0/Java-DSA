package com.Backtracking.Maze;

import java.util.ArrayList;
import java.util.List;

public class Print_The_Paths {
    // In this maze question, We have print the paths
    public static void main(String[] args) {
        printPaths("",3,3);
        List<String> ans = printPathsList("",3,3);

        System.out.println(ans);

    }
    static void printPaths(String p ,int r , int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r > 1)
        {
            printPaths(p+"D",r-1,c);
        }
        if(c> 1)
        {
            printPaths(p+"R",r,c-1);
        }
    }

    static List<String> printPathsList(String p , int r , int c)
    {
        if(r == 1 && c == 1)
        {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(r > 1)
        {
         list.addAll(printPathsList(p+"D",r-1,c));
        }
        if(c> 1)
        {
            list.addAll(printPathsList(p+"R",r,c-1));
        }

        return list;
    }
}
