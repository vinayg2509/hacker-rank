package com.bridgelabz.hackerrank;

import java.util.Scanner;

public class SequenceGenerator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int current = a;
            for (int j = 0; j < n; j++) {
                current += b * Math.pow(2, j);
                System.out.print(current + " ");
            }
            System.out.println(); // move to the next line for the next query
        }
    }
}
