package com.bridgelabz.hackerrank;

import java.util.Scanner;

public class ParallelogramAreaCalculator
{
    static  int B,H;
    static boolean flag=true;
    static Scanner scanner= new Scanner(System.in);
    static
    {
        B=scanner.nextInt();
        H=scanner.nextInt();
        if(B<=0||H<=0)
        {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) throws Exception {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}

