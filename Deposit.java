package com.alpha.work2;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        float stavka = (float) 12;

        Scanner info = new Scanner(System.in);
        System.out.print("Vvedite summu deposita: ");
        String summa = info.nextLine();

        Scanner info1 = new Scanner(System.in);
        System.out.print("Srok deposita v mesiazah: ");
        String srok = info1.nextLine();

        System.out.println("Summa deposita = " + summa + " grn" + ", " + "Srok deposita = " + srok + " mesiazev");
        double dsumma = Double.parseDouble(summa);
        double dsrok = Double.parseDouble(srok);
        double Pribyl= (dsumma * stavka / 100) / 12 * dsrok;
        System.out.print("Vasha pribyl budet ravna =  " + Pribyl + " grn");


    }
}
