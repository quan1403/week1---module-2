package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số");


        int n = sc.nextInt();
        int a = n %10;
        int b = (n /10)%10;
        int c = n / 100;

        String num = "";
        if (c > 0)
            switch (c){
                case 1 :
                    num +="một trăm";
                case 2:
                   num +="hai trăm";
                case 3:
                   num +="ba trăm";
                case 4:
                    num +="bốn trăm";
                case 5:
                    num +="năm trăm";
                case 6:
                    num +="sáu trăm";
                case 7:
                    num +="bảy trăm";
                case 8:
                   num +="tám trăm";
                case 9:
                    num +="chín trăm";
                    break;

        }
        switch (a){
            case 0 :
                num+="không";
            case 1 :
                num+="một";
            case 2:
                num+="hai";
            case 3:
                num+="ba";
            case 4:
                num+="bốn";
            case 5:
                num+="năm";
            case 6:
                num+="sáu";
            case 7:
                num+="bảy";
            case 8:
                num+="tám";
            case 9:
                num+="chín";
                break;

        }
        switch (b){
            case 0:
                num+="linh";
            case 1:
                num+="mười";
            case 2:
                num+="hai mươi";
            case 3:
                num+="ba mươi";
            case 4:
                num+="bốn mươi";
            case 5:
                num+="năm mươi";
            case 6:
                num+="sáu mươi";
            case 7:
                num+="bảy mươi";
            case 8:
                num+="tám mươi";
            case 9:
                num+="chín mươi";
        }
        System.out.println(num);




    }
}
