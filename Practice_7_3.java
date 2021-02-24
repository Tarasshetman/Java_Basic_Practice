package com.alpha.work4;

import java.util.Arrays;
import java.util.Scanner;

public class task73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array's size:  ");
        int Msize = sc.nextInt();
        for (int[] Rmatrix : createMatrix(Msize))
            System.out.println(Arrays.toString(Rmatrix));
    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int w = 0; w < size; w++) {
                matrix[i][w] = (i + 1) + (w * size);

                //System.out.println(Arrays.toString(matrix));
            }


        }
        return matrix;
    }
}
