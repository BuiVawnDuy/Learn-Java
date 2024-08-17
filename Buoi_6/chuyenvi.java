package Buoi_6;

import java.util.Scanner;

public class chuyenvi {

    public static void chuyenVi(double[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                double tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.printf("%.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] matrix = new double[n][n];

        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextDouble();
            }
        }

        chuyenVi(matrix);
    }
}
