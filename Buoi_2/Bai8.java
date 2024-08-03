package Buoi_2;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        in.nextLine(); //Xóa bộ nhớ đệm
        String name = in.nextLine();
        System.out.printf("Xin chao %s, tuoi %d\n", name, age);
    }
}
