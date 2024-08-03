package Buoi_2;

import java.util.Scanner;

public class Bai11 {
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.printf("Khoang cach giua hai diem (%.2f, %.2f) va (%.2f, %.2f) la: %.2f\n", x1, y1, x2, y2, distance(x1, y1, x2, y2));
    }
}
