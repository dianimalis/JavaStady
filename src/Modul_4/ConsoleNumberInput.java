package Modul_4;

import java.util.Scanner;

/**
 * Created by dianimalis on 05.02.2018.
 */
public class ConsoleNumberInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine(); // Считать следующую линию
        String[] numbers = line.split(""); // Разбить ее по пробелам

        int[] realNumbers = new int[numbers.length]; // Достаем из линии числа
        for (int i = 0; i < numbers.length; i++) {

            try { // Предотвратить краш проги, если введут не числа, а символы
                realNumbers[i] = Integer.parseInt(numbers[i]);
            } catch (Exception e) { // Ловит ошибку
                // Обработка
                System.err.println(numbers[i] + " - Это не число"); // И выводит красной строкой, что это не число
            }
            // родолжение
            }
            for (int realNumber : realNumbers) {
                System.out.println(realNumber);
            }
            System.out.println();
            System.out.println("Your Array size is: " + realNumbers.length);

        }
    }

