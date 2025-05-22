package com.bridgelabz.hackerrank;

import java.util.Scanner;

public class EndOfFileReader
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=1;

        while (scanner.hasNext())
        {
            System.out.println(n +" "+scanner.nextLine());
            n++;
        }
    }
}
