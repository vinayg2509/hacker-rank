package com.bridgelabz.hackerrank;

import java.util.Scanner;

public class StringPalindromeCheck
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String string=scanner.next();
        if(isPalindrome(string))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    private static boolean isPalindrome(String string)
    {
        String reverseString= "";
        char []c=string.toCharArray();
        for (int i=c.length-1;i>=0;i--)
        {
            reverseString+=(c[i]);
        }
        System.out.println(string);
        System.out.println(reverseString);

        return string.equals(reverseString.toString());
    }
}
