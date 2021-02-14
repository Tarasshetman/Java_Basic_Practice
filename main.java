package com.alpha.work5;

public class main {
    public static void main(String[] args) {
        String text1 = "Java basic courses";
        System.out.println(text1);
        int length = text1.length();
        //System.out.println(length);

        int pos = 0;
        while (pos < length) {
            char ch = text1.charAt(pos);
            //System.out.print(ch);
            int one = text1.indexOf(ch);
            //System.out.print(one);
            int two = text1.lastIndexOf(ch);
            //System.out.print(two);
            if (one == two) {

               System.out.print(ch + " ");

            }
            pos++;
        }
    }
}