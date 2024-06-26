package com.Recursion.String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
//        permutaion("","abc");
        System.out.println(permutaionList("","abc"));
    }

    static void permutaion(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutaion(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutaionList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<=p.length();i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i);
            ans.addAll(permutaionList(f+ch+s,up.substring(1)));
        }
        return ans;
    }
}
