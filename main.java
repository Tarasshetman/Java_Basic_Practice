package com.alpha.work5;

public class main {
    public static void main(String[] args) {

        System.out.println("* |" + "1 " + "2 " + "3 " + "4 " + "5 " + "6 " + "7 " + "8 " + "9 " );
        System.out.println("_________________________");
        int i = 1;
        int j = i;

        while (i < 10) {

                System.out.print(i +" |" + i + " ");
                while (j < 9) {
                    j++;
                    System.out.print(j * i + " ");
                }
                i++;
                j = 1;
                System.out.println("");
            }
        }
    }

