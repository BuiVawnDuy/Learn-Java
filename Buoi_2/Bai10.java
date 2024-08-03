package Buoi_2;

import java.util.Scanner;

public class Bai10 {
    public static int qualityPoints(int dtb){
        if(dtb >=90 && dtb <= 100)
            return 4;
        else if(dtb >= 80 && dtb <= 89)
            return 3;
        else if(dtb >= 70 && dtb <= 79)
            return 2;
        else if(dtb >= 60 && dtb <= 69)
            return 1;
        return 0; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dtb = sc.nextInt();
        System.out.printf("Diem %d theo thang 4 la: %d", dtb, qualityPoints(dtb));
    }
}
