package com.alpha.work7;

import java.util.Scanner;

public class practice_4_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Vvedite chyslo ot 1 do 9:  ");
        int d = x.nextInt();
            switch (d){
                case 1:System.out.println("One" + " = " + d); break;
                case 2:System.out.println("Two" + " = " + d); break;
                case 3:System.out.println("Three" + " = " + d); break;
                case 4:System.out.println("Four" + " = " + d); break;
                case 5:System.out.println("Five" + " = " + d); break;
                case 6:System.out.println("Six" + " = " + d); break;
                case 7:System.out.println("Seven" + " = " + d); break;
                case 8:System.out.println("Eight" + " = " + d); break;
                case 9:System.out.println("Nine" + " = " + d); break;
                default:System.out.println("Other"); break;
            }
    }
}
