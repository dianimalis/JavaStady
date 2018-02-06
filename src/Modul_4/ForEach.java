package Modul_4;

/**
 * Created by dianimalis on 05.02.2018.
 */
public class ForEach {
    public static void main(String[] args) {


        int[] array = new int[]{1, 2, 3, 4, 4, 5, 6, 7}; // Задача: все числа умножить на два и вывести.

        // Использование "for" варианта
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * 2 + " "); // print фигачит в строку
        }
        System.out.println();

        // Использование "for each" варианта
        for (int x : array) { //int x - значение элемента из массива
            // в каждой следующей итерации фор ич сам сделает сдвиг на один правее
            System.out.println(x * 2 + " "); // println фигачит в столбик


        }
    }
}
