package com.bridgelabz.hackerrank;

import java.util.Scanner;

public class StringAnagramCheck
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        System.out.println(isAnagram(s1,s2)?"Anagram":"Not Anagram");

    }

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();


        if (a.length() != b.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
