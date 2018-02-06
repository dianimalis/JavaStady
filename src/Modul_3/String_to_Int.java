package Modul_3;// Пример считывания массива не зная его размер!!!

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class String_to_Int { // Считывание массива
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем сканер

        String line = scanner.nextLine(); // Считать целиком всю строку стринг
        String[] numbers = line.split(" "); // Воможность разделить строку по какому-то символу, в этом случае по пробелу
        // и это все уже вернет нам массив строк, в котором будут храниться числа

         int[] realNumbers = new int[numbers.length];// Создаем конечный массив, в котором хотим хранить результат. Длинной такой, какой длинны массив намберс.
            for (int i = 0; i < numbers.length; i++){ // Идём по всему массиву
                realNumbers[i] = Integer.parseInt(numbers[i]);// Превращаем их в массив чисел из массива стрингов
            }
            Arrays.sort(numbers); // Отсортируем строки, не числа
            Arrays.sort(realNumbers); //Если нужно отсортируем для нагладности по числам

            for (int realNumber : realNumbers) { // С помощью форича проходимся по всем стрингам и выводим каждое их них в консоль намбер
                // Считали массив без ввода массива любого размера
                System.out.println(realNumber);
            }

                System.out.println(); // Пустой пробел между строками

                        for (String number : numbers){ // Выводим форичем строки
                    System.out.println(number);
                }


        }
    }

