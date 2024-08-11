package Buoi_3;

import java.util.Scanner;

public class Bai4 {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<x;i++){
            if(isPrime(i)){
                System.out.printf("%d ", i);
            }
        }
    }
}
