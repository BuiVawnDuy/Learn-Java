package Buoi_1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int i = 4;
        // while(n > 10){
        //     int digit = (int)(n / Math.pow(10, i));
        //     System.out.printf("%d ", digit);
        //     n -= digit * Math.pow(10, i);
        //     i--;
        // }

        //System.out.printf("%d", n);

        for(int i = 4; i>=1;i--){
            int digit = (int)(n / Math.pow(10, i));
            System.out.printf("%d ", digit);
            n -= digit * Math.pow(10, i);
        }
        System.out.printf("%d", n);
    }
}
