package Buoi_1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = c * (double)9/5 + 32;
        System.out.printf("%.1f C = %.1f F", c, f);
    }
}