package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a:");
        System.out.println("enter b");
        int a = input.nextInt();
        int b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);


        if ((a == 0) && (b == 0)) {
            System.out.println("không có ước chung lớn nhất");
        }
        while (a !=b){
            if ((a == 0)&&(b > 0)){
                System.out.println("ước chung lớn nhất :"+b);
                break;
            }else if((a > 0)&&(b ==0 )){
                System.out.println("ước chung lớn nhất "+a);
                break;
            }else
            if (a % b ==0){
                System.out.println("ước chung lớn nhất :"+a);
                break;
            }else if (b %a ==0){
                System.out.println("ước chung lớn nhất :"+b);
                break;
//
            }
        }
    }
}
