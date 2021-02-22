package com.alpha.work1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println(Arrays.toString(createArray(sc.nextInt())));
    }
    public static int[] createArray(int size) {

        int[] arrayInt = new int[size];
        int i = 0;
        int b = 2;
        /*while (i < arrayInt.length){
            arrayInt[i] = b;
            b += 2;
            i++;
        }*/
        for (i = 0, b = 2; i < arrayInt.length; i++, b+=2 ) {
           arrayInt[i] = b;
        }
        return arrayInt;
    }

}
