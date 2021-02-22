package com.alpha.work4;

import java.util.Arrays;
import java.util.Scanner;

public class task73 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(createMatrix(0)));
    }
    public static int[][] createMatrix(int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array's size:  ");
        int q = sc.nextInt();
        int z = sc.nextInt();
        int[][] matrix = new int[q][z];
        for (int i = 1 /*, a = 5, b = 9, c = 13*/; i <= matrix.length; i++/*, a++, b++, c++*/){

                System.out.println("|" + i + "|");


        }

        return matrix;
    }
}
