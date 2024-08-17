package Buoi_6;

import java.util.Scanner;

public class magicsquare {

    public static boolean checkRow(int[][] matrix){
        int[] tmpRow = new int[matrix.length];

        for(int i=0;i<matrix.length;i++){
            int sum = 0;
            for(int j = 0;j<matrix.length;j++){
                sum += matrix[i][j];
            }
            tmpRow[i] = sum;
        }

        if(tmpRow.length > 0){
            int t = tmpRow[0];
            for(int i = 1;i<tmpRow.length;i++){
                if(tmpRow[i] != t) return false;
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] matrix){
        int[] tmpCols = new int[matrix.length];
        for(int j=0;j<matrix.length;j++){
            int sum = 0;
            for(int i = 0;i<matrix.length;i++){
                sum += matrix[i][j];
            }
            tmpCols[j] = sum;
        }

        if(tmpCols.length > 0){
            int t = tmpCols[0];
            for(int i = 1;i<tmpCols.length;i++){
                if(tmpCols[i] != t) return false;
            }
        }
        return true;
    }

    public static boolean checkDC(int[][] matrix, int n){
        int sumCheoChinh = 0, sumCheoPhu = 0;
        for(int i = 0;i<matrix.length;i++){
            sumCheoChinh += matrix[i][i];
            sumCheoPhu += matrix[i][n - 1 - i];
        }
        if(sumCheoChinh != sumCheoPhu) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i= 0;i<n;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        if(checkRow(matrix) && checkColumn(matrix) && checkDC(matrix, n)){
            System.out.println("Matrix is magic square");
        }
        else{
            System.out.println("Matrix is not magic square");
        }
    }
}
