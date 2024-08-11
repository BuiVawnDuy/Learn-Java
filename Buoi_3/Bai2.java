package Buoi_3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        int decNum = 0;
        int i = 0;
        while(binNum > 0){
            int tmp = binNum % 10;
            decNum += tmp * Math.pow(2, i);
            binNum /= 10;
            i++;
        }

        System.out.printf("%d", decNum);
    }
}
