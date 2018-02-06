package Modul_2;

import java.util.Scanner;

/**
 * Created by dianimalis on 03.02.2018.
 */
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст:");
        String line = sc.nextLine(); // Считывает строку, не числовой - символьный (текст)
        System.out.println("Вывод: " + line);

        System.out.println("Введите число:");
        int Integer = sc.nextInt();
        System.out.println("Вывод:" + Integer);
    }
}
