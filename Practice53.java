package com.alpha.work4;

public class Practice53 {
    public static void main(String[] args) {
        String text1 = "An information system is designed to collect, process, store and distribute information";
        System.out.println(text1);
        int str1 = text1.length();
        //System.out.println(str1);
        char str2 = text1.charAt(text1.lastIndexOf(' ') + 1);
        //System.out.println(str2);
        int str3 = text1.lastIndexOf(' ') + 1;
        //System.out.println(str3);
        String lastword = text1.substring(str3, str1);
        //System.out.println(lastword);
        String firstword = text1.substring(0, text1.indexOf(" ", 0));
        //System.out.println(firstword);
        String text2 = text1.replace(firstword, lastword);
        //System.out.println(text2);
        int str4 = text2.length();
        //System.out.println(str4);
        int text3 = str4 - lastword.length();
        String text4 = text2.substring(0, text3);
            //System.out.println(text4);
            String text5 = text4 + firstword;
            System.out.println(text5);


    }
}