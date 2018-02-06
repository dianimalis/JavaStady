package Modul_2;

import java.util.Scanner;

/**
 * Created by dianimalis on 03.02.2018.
 */
public class Practise_2 {
    public static void main(String[] args) {
        System.out.println("Type fractional number 1: ");
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        System.out.println("Type fractional number 2: ");
        double B = scan.nextDouble();
        double X = A + B;
        System.out.println(A + " + " + B + " = " + X);
        double S = A * B;
        System.out.println(S);


    }

}
