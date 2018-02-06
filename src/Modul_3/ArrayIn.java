package Modul_3;

import java.util.Scanner;
public class ArrayIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt, i = 0;
        System.out.println("Укажи размер массива: ");
        cnt = scanner.nextInt();
        int[] array = new int[cnt];
        System.out.println("Заполни массив:");
        System.out.println();
        while (i < cnt) {
            System.out.println("Укажи " + i + " элемент массива: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Спасибо, массив заполнен!");
        System.out.println();
        int ind = -1;
        while (ind < 0 || ind >= cnt) {
            System.out.println("Enter index of element in your integer array \n"  +
                    "(it can be only integer from 0 to " + (cnt - 1) + "): ");
            ind = scanner.nextInt();
        }
        System.out.println("Value of the element №" + ind + " is: " + array[ind]);
    }
}

