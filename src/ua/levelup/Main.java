package ua.levelup;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double Z;
        double S;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input y:");
        double y = Sc.nextDouble();

        Z = 3 * MySqr(y, 2) + Math.sqrt(MySqr(y, 3) + 1);

        System.out.println("Z = ");
        System.out.println(Z);

        S = Math.sqrt(Math.cos(4 * MySqr(y, 2)) + 7.151);
        System.out.println("S = ");
        System.out.println(S);
    }

    static double MySqr(double arg, int ex) {
        double Rez = arg;
        for (int i = 1; i < ex; i++) {
            Rez = Rez * arg;
        }
        return Rez;

    }
}
