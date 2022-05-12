package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("nhập kích cỡ mảng");
        size = sc.nextInt();
        if (size > 20) {
            System.out.println(" kích cỡ vượt quá 20");
        }
        }
        while (size >20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhập số"+ (i +1)+ ":" );
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("danh sách tài sản :");
        for (int j = 0; j < array.length ; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j <array.length ; j++) {
            if (max < array[j]){
                max = array[j];
                index = j +1;
            }

        }
        System.out.println("Giá trị tài sản lớn nhất \t"+ max +"vị trí " +index );

    }
}
