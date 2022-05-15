package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice !=0){
            System.out.println("menu");
            System.out.println("1.Giải phương trình bậc 2");
            System.out.println("0.Exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập vào a");
                    double a = sc.nextDouble();
                    System.out.println("nhập vào b");
                    double b = sc.nextDouble();
                    System.out.println("nhập vào c");
                    double c = sc.nextDouble();
            }

        }
    }
}
