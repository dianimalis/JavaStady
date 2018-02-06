package Modul_2;

import java.util.Scanner;

/**
 * Created by dianimalis on 03.02.2018.
 */
public class Ex5 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Type A: ");
        int a = scr.nextInt();
        System.out.println("Type B: ");
        int b = scr.nextInt();
        System.out.println("Type C: ");
        int c = scr.nextInt();

        int bigger = a > b ? a : b;
        int max = bigger > c ? bigger : c;

        System.out.println(max);



    }
}