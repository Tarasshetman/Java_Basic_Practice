package com.alpha.work5;


public class Main {
    public static void main(String[] args) {

        int number1 = (5 * 100 + 4 * 10 + 6 * 1);
        int number = (5 * 100 + 4 * 10 + 6 * 1);
        System.out.println("Treh.znach.chyslo = " + number);
        int des = number % 10;

        //System.out.println(des);
        number /= 10;

        int des1 = number % 10;
        //System.out.println(des1);

        number /= 10;

        int des2 = number % 10;
        //System.out.println(des2);
        System.out.println("Revers  =" + des + des1 + des2);

        int razniza = (des * 100 + des1 * 10 + des2 * 1) - number1;
        System.out.println("Razniza = " + razniza);

    }
}
