package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 100000000.0;
        int month = 3;
        double interesRate = 5.5;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter investment amount");
        System.out.println("enter number of month:");
        System.out.println("enter annual interest rate in percentage:");

        double totalInterest = 0;

            totalInterest += money * (interesRate / 100) / 12 * month;

        System.out.println(" total of interest:" +totalInterest);

    }

}
