package com.alpha.work3;

import java.util.Scanner;

public class task72 {
    public static void main(String[] args) {
     System.out.println(sumOddElementsArray(0));
    }
    public static int[] sumOddElementsArray(int array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of numbers: ");
        int qty = sc.nextInt();
        int sum = 0;
        int [] arrayInt = new int[qty];
        for (int i = 1; i < arrayInt.length; i++){
            arrayInt[i] = i;
            System.out.print(arrayInt[i] + " ");
        }
        for (int  j = 1; j < arrayInt.length;  j += 2){
            sum = sum + arrayInt[j];
            //System.out.print(arrayInt[j] + " ");
        }
        System.out.println(". Summ of array = " + sum);
        return arrayInt;
    }
}
