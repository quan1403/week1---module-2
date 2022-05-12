package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("nhập sự lựa chọn ");
            choice = input.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("nhập F :");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius:"+fahrenheit);
                    break;
                }
                case 2:{
                    System.out.println("nhập C :");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit:"+celsius);
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while (choice !=0);

    }
    public static double clesiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5) *celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9) * (fahrenheit -32);
        return celsius;
    }
}
