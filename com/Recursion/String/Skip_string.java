package com.Recursion.String;

public class Skip_string {
    public static void main(String[] args) {
        String word = "bbkapplewet";
        System.out.println(skip_str(word));
    }

    static String skip_str (String word)
    {
     if(word.isEmpty())
     {
         return "";
     }
     char ch = word.charAt(0);
     if(word.startsWith("apple"))
     {
         return skip_str(word.substring(5));
     }
     return ch + skip_str(word.substring(1));
    }
}
