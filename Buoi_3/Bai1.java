package Buoi_3;

import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soSV = sc.nextInt();
        int[] diem = new int[soSV];
        for(int i=0;i<soSV;i++){
            diem[i] = sc.nextInt();
        }

        System.out.println("Diem\tSo SV\tHistogram");
        
        int d = 0;
        while(d <= 10){
            int cnt = 0;
            for(int di : diem){
                if(d == di) cnt++;
            }
            System.out.printf("%d\t%d\t", d, cnt);
            for(int i=0;i<cnt;i++){
                System.out.print("*");
            }
            System.out.println();
            d++;
        }
    }
}