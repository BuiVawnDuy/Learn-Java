package Buoi_3;

import java.util.Scanner;

public class Bai3 {
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n % i == 0){
                sum += i;
            }
        }

        if(sum == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(isPerfect(i)){
                System.out.printf("%d ", i);
            }
        }
    }
}
