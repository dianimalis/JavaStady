package Modul_4;

import java.util.Scanner;

/**
 * Рекурсия, вывод от 1 до 5
 */
public class Practice_4_1 {

    static String recursion (int n) {
        if (n == 1) { //База (базовый случай, от которого начнется откат рекурсии
            return "1";
        }
        return recursion (n - 1) + " " + n; // Шаг рекурсии, рекурсивное условие
    }


    public static void main(String[] args) {
        System.out.println(recursion(5));

    }
}
