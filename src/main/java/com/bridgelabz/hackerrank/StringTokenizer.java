package com.bridgelabz.hackerrank;

public class StringTokenizer
{
    public static void main(String[] args) {
        String s="He is a very very good boy, isn't he?";
        String[] tokens=s.trim().split("[^A-Za-z]+");
        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
