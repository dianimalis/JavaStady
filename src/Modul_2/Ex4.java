package Modul_2;

import java.util.Scanner;

/**
 * Created by dianimalis on 03.02.2018.
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double A = scr.nextDouble();
        double B = scr.nextDouble();

        if (A == B) {// равно ли а и б?
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (A % B == 0){ // делится ли а на б без остатка?
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        if (A > B){ // а больше чем б?
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}