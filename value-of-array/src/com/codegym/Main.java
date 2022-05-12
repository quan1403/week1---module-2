package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String [] students = {"Quan","Duong","Viet","Tuan","Tinh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên");
        String name = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length ; i++) {
            if (students[i].equals(name)) {
                System.out.println("vị trí của sinh viên trong ds " + name + "is" + i);
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("không có "+ name+"trong danh sách");
        }
    }
}
