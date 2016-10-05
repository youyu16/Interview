package com.test;

import java.util.Scanner;

/**
 * Created by t-tiyou on 9/30/2016.
 */
public class MatrixTimeItReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int initNum = sc.nextInt();
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] a = Matrix(row, col, initNum);
            int[][] b = getReverse(a, row, col);
            printMatrix(a, b);
        }
        sc.close();
    }

    static int[][] Matrix(int row, int col, int init) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = init++;
            }
        }
        return matrix;
    }

    static int[][] getReverse(int a[][], int row, int col) {
        int b[][] = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    static void printMatrix(int[][] a, int[][] b) {

        int c[][] = new int[a.length][b[0].length];

        int x, i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b[0].length; j++) {
                int temp = 0;
                for (x = 0; x < b.length; x++) {
                    temp += a[i][x] * b[x][j];

                }
                c[i][j] = temp;

            }
        }

        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < b[0].length; n++) {
                System.out.print(c[m][n] + "\t");
            }
            System.out.println();
        }
    }
}
