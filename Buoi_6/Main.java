package Buoi_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] matrix = new double[n][3];
        double[][] tmp = new double[5][4];

        for(int i=0;i<n;i++){
            for(int j = 0;j<3;j++){
                matrix[i][j] = sc.nextDouble();
            }
        }
        
        for(int k = 1;k<=5;k++){
            for(int i = 0; i<n;i++){
                for(int j=0;j<3;j++){
                    if(matrix[i][1] == k){
                        tmp[(int)matrix[i][1] - 1][(int)matrix[i][0] - 1] = matrix[i][2];
                    }
                }
            }
        }

        // \n, \b, \t, \a, \r, \\, \', \" => escape character
        System.out.println("SP\\NV\t\t1\t2\t3\t4\tTong");
        for(int i = 0;i<5;i++){
            double sumRow = 0;
            System.out.printf("%d\t\t", i+1);
            for(int j = 0;j<4;j++){
                System.out.printf("%.2f\t", tmp[i][j]);
                sumRow += tmp[i][j];
            }
            System.out.printf("%.2f\n", sumRow);
        }
        
        System.out.print("Tong\t\t");
        for(int j = 0;j<4;j++){
            double sumCol = 0;
            for(int i = 0;i<5;i++){
                sumCol += tmp[i][j];
            }
            System.out.printf("%.2f\t", sumCol);
        }
    }
}