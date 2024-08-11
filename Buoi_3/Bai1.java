package Buoi_3;

import java.util.Scanner;

public class Bai1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soSV = sc.nextInt();
        int[] diemSVs = new int[soSV];
        for(int i=0;i<soSV;i++){
            diemSVs[i] = sc.nextInt();
        }

        System.out.println("Diem\tSo SV\tHistogram");
        
        int diem = 0;
        while(diem <= 10){
            int cnt = 0;
            for(int diemSV : diemSVs){
                if(diemSV == diem) cnt++;
            }
            System.out.printf("%d\t%d\t", diem, cnt);
            for(int i=0;i<cnt;i++){
                System.out.print("*");
            }
            System.out.println();
            diem++;
        }
        
    }
}