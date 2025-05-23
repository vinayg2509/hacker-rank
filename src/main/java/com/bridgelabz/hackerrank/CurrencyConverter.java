package com.bridgelabz.hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india= NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINESE);
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
