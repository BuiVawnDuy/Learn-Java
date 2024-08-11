package Buoi_3;

import java.util.Scanner;

public class Bai5 {
    public static int intReverse(int n){
        int result = 0;
        while(n > 0){
            int tmp = n % 10;
            result = result * 10 + tmp;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a;i<=b;i++){
            System.out.printf("%d\t%d\n", i, intReverse(i));
        }
    }
}
