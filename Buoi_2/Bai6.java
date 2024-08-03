package Buoi_2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int giayNhap = sc.nextInt();
        int giay = giayNhap;
        int gio = giay / 3600; // 3661 => 3661/3600 = 1
        giay = giay % 3600; // 3661 % 3600 = 61
        int phut = giay / 60; // 61/60 = 1
        giay = giay % 60; // giay = 61 % 60 = 1
        System.out.printf("%d giay = %d gio, %d phut, va %d giay", giayNhap, gio, phut, giay);
    }
}
