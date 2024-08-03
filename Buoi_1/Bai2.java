package Buoi_1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canNang = sc.nextDouble();
        double chieuCao = sc.nextDouble();
        double bmi = canNang/Math.pow(chieuCao, 2);
        System.out.printf("bmi = %.2f\n", bmi);
        if(bmi < 18.5){
            System.out.println("Gay");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Binh thuong");
        }
        else if(bmi > 24.9 && bmi <= 29.9){
            System.out.println("Thua can");
        }
        else{
            System.out.println("Bao phi");
        }
    }
}
