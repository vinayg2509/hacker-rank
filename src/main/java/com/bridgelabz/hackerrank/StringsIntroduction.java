package com.bridgelabz.hackerrank;

import java.util.Scanner;

public class StringsIntroduction
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        String A=scanner.next();
        String B=scanner.next();

        int sizeA=A.length();
        int sizeB=B.length();
        System.out.println(sizeA+sizeB);
        System.out.println(A.compareTo(B)>0?"Yes":"NO");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase()
                +" "+B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase());
    }
}
