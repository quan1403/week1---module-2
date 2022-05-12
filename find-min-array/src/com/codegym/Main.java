package com.codegym;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,12,4,5,7,8};

        System.out.println("Số nhỏ nhất trong mảng :");
        System.out.println( minValue(arr));
    }
    public static int minValue(int[]array){
        int index = 0;
        for (int i = 1; i <array.length ; i++) {
            if (array[i] < array[index]){
                index = i;
            }

        }
        return index;
    }
}
