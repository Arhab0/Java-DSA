package com.Recursion.String;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
//        subseq("","abc");
        System.out.println(subSequences("","abc"));
    }

    static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subSequences(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSequences(p+ch,up.substring(1));
        ArrayList<String> right = subSequences(p,up.substring(1));

        left.addAll(right);
        return left;
    }

}
