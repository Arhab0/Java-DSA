package com.Recursion.String;

public class Skip_a_Character {
    public static void main(String[] args) {
        String anything = "abbccad" , ans = "";
        System.out.println(skip(anything,ans));
    }

    static String skip (String word, String ans) {
        if (word.isEmpty()) {
            return  ans;
        }
        char ch = word.charAt(0);

        if (ch == 'a')
        {
            return skip(word.substring(1),ans);
        }
        return skip(word.substring(1),ans+ch);
    }
}
