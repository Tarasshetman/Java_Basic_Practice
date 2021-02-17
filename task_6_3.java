package com.alpha.work6_4;

import java.util.Scanner;

public class task_6_3 {
    public static void main(String[] args) {

        System.out.println(getFirstCharacterOfWord("Today is very good weather", 0));
    }
    public static String getFirstCharacterOfWord(String str, int numberWord) {

        //str = "Today is very good weather";
        System.out.println(str);
        int len = str.length();
        String len1 = str.substring(0, str.indexOf(' '));
        System.out.println("Vvedite nomer slova v stroke: ");
        Scanner scanner = new Scanner(System.in);
        numberWord = scanner.nextInt();
        int space = 0;
        int b = 0;
        while (b < len) {
            char ch = str.charAt(b);
            //System.out.println(b);
            if (ch == ' ') {
                space++;
                //System.out.println(ch)
            }
            b++;

        }
        if (numberWord > 0 && numberWord <= (space + 1)) {
            if (numberWord == 1){
                int a1 = str.indexOf(' ');
                System.out.println("Slovo pod nomerom " + numberWord + " = " + str.substring(0, str.indexOf(' ')));
                System.out.println("Pervyi simvol:  " + str.charAt(0));
            } else if (numberWord == (space + 1)){
                int a_n = str.lastIndexOf(' ');
                System.out.println("Slovo pod nomerom " + numberWord + " = " + str.substring(a_n + 1));
                System.out.println("Pervyi simvol:  " + str.charAt(a_n + 1));
            } else {
                int q = 0;
                int w_space = 0;
                while (q < str.length()){
                    char ch = str.charAt(q);
                    if (ch == ' '){
                        w_space++;
                        if ((numberWord - 1) == w_space){
                            String str1 = str.substring(q + 1);
                            String str2 = str1.substring(0, str1.indexOf(' '));
                            System.out.println("Slovo pod nomerom " + numberWord + " = " + str2);
                            System.out.println("Pervyi simvol:  " + str2.charAt(0));

                        }
                    }
                    q++;
                }
            }

        }
        else {
            System.out.println("Ne vernyi nomer slova");
        }
        return str;
    }

}
