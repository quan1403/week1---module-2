package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Nhập số lượng số nguyên tố cần in ra :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0){
            System.out.println("nhập lại số");
        }else {
            int count = 1;
            int a = 2;
            while (count <= number){
                boolean check = true;
                for (int i = 2; i < a /2 ; i++) {
                    if (a % i ==0 & a !=2){
                        check = false;
                        break;
                    }


                }
                if (check){
                    System.out.println("in ra các số nguyên tố :"+a);
                    count ++;

                }
                a++;
            }
        }

    }
}
