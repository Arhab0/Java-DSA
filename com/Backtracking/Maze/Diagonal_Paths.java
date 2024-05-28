package com.Backtracking.Maze;

import java.util.ArrayList;
import java.util.List;

public class Diagonal_Paths {
    public static void main(String[] args) {
        List<String> ans2 = printPathsListDiagonal("",3,3);
        System.out.println(ans2);
    }
    static List<String> printPathsListDiagonal(String p , int r , int c)
    {
        if(r == 1 && c == 1)
        {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(r>1 && c > 1)
        {
            list.addAll(printPathsListDiagonal(p+"D",r-1,c-1));
        }
        if(r > 1)
        {
            list.addAll(printPathsListDiagonal(p+"V",r-1,c));
        }
        if(c> 1)
        {
            list.addAll(printPathsListDiagonal(p+"H",r,c-1));
        }

        return list;
    }
}
