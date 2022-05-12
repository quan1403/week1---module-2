package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("nhập usd");
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        double quy_doi = usd * 23000;
        System.out.println("Quy đổi tiền tệ \n"+quy_doi);
    }
}
