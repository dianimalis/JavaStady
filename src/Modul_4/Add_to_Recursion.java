package Modul_4;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * Created by dianimalis on 05.02.2018.
 */
public class Add_to_Recursion {

    static String recursion(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a + 1, b); // Вывод 1
        }
    }

    static void count(int a, int i) { // Выводит от 1 до пяти, если с консоли ввести 5.
        i++;
        System.out.println(i);
        if (i < a)
            count(a, i); // Вывод 3
    }

    static void countdown(int i) {// Вывод 2. Метод от большего к меньшему вывод

        if (i < 0) return;
        System.out.println(i + " ");
        countdown(i - 1);


    }


    public static void main(String[] args) {
        //System.out.println(recursion(10, 20)); // Вывод 1. от 10 до 20
        //System.out.println(recursion(40, 20)); // Вывод 1. от 40 до 20

        Scanner scanner = new Scanner(System.in); //Вывод 3
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //System.out.println(recursion(a, b)); // Вывод 3. Ввод с консоли
        //count(a, 0); // Вывод 3. От 1 до ввод с консоли.

        System.out.println("countdown: ");
        countdown(a); //Вывод 3.
    }
}
