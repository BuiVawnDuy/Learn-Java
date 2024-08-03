package Buoi_1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int giay1Ngay = 24 * 3600;
        int gio = sc.nextInt();
        int phut = sc.nextInt();
        int giay  = sc.nextInt();
        int giayNhap = giay + phut * 60 + gio * 3600;
        System.out.printf("So giay tinh tu nua dem: %d\n", giayNhap);
        System.out.printf("So giay con lai trong ngay: %d", giay1Ngay - giayNhap);
    }
}
