package com.alpha.work_7_5;

import java.util.Arrays;
import java.util.Scanner;

public class Task_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits:  ");
        String digits = sc.nextLine();
        int[] mainmas = countOfSequenceNumbers(digits);
        System.out.println(Arrays.toString(mainmas));

    }
    public static int[] countOfSequenceNumbers(String numbers) {
        String dig = "123456789";
        int[] massdig = new int[9];
        //System.out.println(numbers.length());
        for (int i = 0; i < numbers.length(); i++) {
            int id = dig.indexOf(numbers.charAt(i));
             if (id >= 0) {
                 massdig[id]++;
             }
        }

        return massdig;
    }
}
