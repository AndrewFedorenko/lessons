package ua.levelup;

import java.io.IOException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Lesson4 {

    public static void main(String[] args) throws IOException {
        int y = 0;
        Scanner Sc = new Scanner(System.in);

        while (y != 7){
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println("Input number or task (from 1 to 6) or 7 to break:");

            y = Sc.nextInt();

            switch (y) {

                case (1):
                    part1();
                    break;

                case (2):
                    part2();
                    break;

                case (3):
                    part3();
                    break;

                case (4):
                    part4();
                    break;

                case (5):
                    part5();
                    break;

                case (6):
                    try {
                        part6();

                    }catch (IOException err){

                    };

                    break;
            }
        }
    }

    static void part1() {
        System.out.println("part 1............");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%-1s x %1s = %-2s   ", j, i, j * i);
            }
            System.out.println();
        }
    }

    static void part2() {
        int lastnum = 9;

        System.out.println("part 2............");

        for (int i = 1; i <= lastnum; i++) {
            for (int j = 1; j <= lastnum; j++) {
                System.out.printf("%-1s x %1s = %-2s   ", i, j, i * j);
            }
            System.out.println();
        }

    }

    static void part3() {
        Scanner Sc = new Scanner(System.in);

        System.out.println("part 3: input string:");

        String str = Sc.nextLine();

        int len = str.length();
        System.out.println("input position from 0 to " + (len-1));
        int pos = Sc.nextInt();

        if (pos > len - 1) {
            System.out.println("Position must be from 0 to " + (len - 1));
            return;
        }

        System.out.println("Chosen character is " + str.charAt(pos));

    }

    static void part4() {
        Scanner Sc = new Scanner(System.in);

        System.out.println("part 4: input string:");

        String str = Sc.nextLine();

        int len = str.length();
        System.out.print("Your reverse word is: ");
        for (int i = 1; i <= len; i++) {
            System.out.print(str.charAt(len - i));

        }

    }

    static void part5() {

        char ch = 'е';
        char newch = 'и';

        Scanner Sc = new Scanner(System.in);

        System.out.println("part 5: input string:");

        String str = Sc.nextLine();

        int len = str.indexOf(ch);
        if (len == -1) {
            System.out.println("no symbol " + ch + " in your string");
            return;
        }
        String newstr = str.replace(ch, newch);
        System.out.println("Your word changed " + ch + " to " + newch + " is: " + newstr);

    }

    static void part6() throws IOException {

        int flen = 15;
        InputStreamReader InputStreamReader = new InputStreamReader(System.in);
        StringBuilder inputstring = new StringBuilder();
        Scanner Sc = new Scanner(System.in);

        System.out.println("part 6: input string " + flen +" symbols length:");
        int read;
        while ((read = InputStreamReader.read()) != -1){
            char ch = (char)read;
            if (ch=='\n')  {
                break;
            }
            inputstring.append(ch);
        }

        if (inputstring.length() < flen) {
            System.out.println("Your string must be 15-length or more");
            return;
        }

        String firststring = inputstring.substring(0, flen).toString();
        System.out.println("Your 15-length string is: " + firststring);

        System.out.println("Input position from (1-" + flen + "):");
        int i = Sc.nextInt();
        System.out.println("Input position to (1-" + flen + "):");
        int j = Sc.nextInt();

        if (i < 1 || j < 1 || i > flen || j > flen || i >= j - 2) {
            System.out.println("Wrong positions enter");
            return;
        }

        String midstr = inputstring.substring(i, j - 1);
        System.out.println("Your middle string is: " + midstr);
        String midrewstr = new StringBuilder(midstr).reverse().toString();
        System.out.println("Your middle reverse string is: " + midrewstr);
        String resultstr = inputstring.substring(0, i) + midrewstr + inputstring.substring(j - 1, flen);
        System.out.println("Your result string is: " + resultstr);

    }

}