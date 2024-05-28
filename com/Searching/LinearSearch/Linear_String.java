package com.Searching.LinearSearch;

public class Linear_String {
    public static void main(String[] args) {
        String name = "arhab";
        char target = 'a';
        System.out.println(linearSearchString(name,target));


    }

    public static boolean linearSearchString(String name, char target)
    {
        if(name.isEmpty())
        {
            return false;
        }

        for(int i = 0; i<name.length();i++)
        {
            if(target == name.charAt(i))
            {
                return true;
            }
        }

        return false;
    }
}

