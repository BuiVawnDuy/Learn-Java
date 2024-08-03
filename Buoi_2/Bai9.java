package Buoi_2;

import java.util.Scanner;

public class Bai9 {
    public static double minimum3(double a, double b, double c){
        double min = Math.min(a,b);
        min = Math.min(min, c);
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.printf("Gia tri nho nhat cua (%.2f, %.2f, %.2f) la: %.2f\n",a,b,c, minimum3(a,b,c));
    }
}
