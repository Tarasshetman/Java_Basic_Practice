package com.alpha.work2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       System.out.print(createArray(0));
    }
    public static int[] createArray(int size) {
        Scanner cs = new Scanner(System.in);
         System.out.println("Enter the count of array: ");
         int qty = cs.nextInt();
       int[] arrayInt = new int [qty / 2];
       for (int i = 0, j = 2; i < arrayInt.length; i++, j += 2) {
           arrayInt[i] = j;
            System.out.print(arrayInt[i] + " ");
       }

       return arrayInt;
    }

}
