package com.alpha.work8;

import java.util.Scanner;

public class Practice_4_2_ifelse {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Vvedite chyslo ot 1 do 9:  ");
        int d = x.nextInt();
        if (d == 1) {
            System.out.println("One");
        }
        if (d == 2) {
            System.out.println("Two");
        }
        if (d == 3) {
            System.out.println("Three");
        }
        if (d == 4) {
            System.out.println("Four");
        }
        if (d == 5) {
            System.out.println("Five");
        }
        if (d == 6) {
                System.out.println("Six");
        }
        if (d == 7) {
                System.out.println("Seven");
        }
        if (d == 8) {
                System.out.println("Eight");
        }
        if (d == 9) {
                System.out.println("Nine");
        }
        else if (d < 1 || d > 9){
                System.out.println("Other");
            }
        }
    }

