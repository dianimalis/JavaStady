package Modul_3.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dianimalis on 17.03.2018.
 */
public class Practice_3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array:");
        int count = scanner.nextInt();

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Input " + i + " element of array:");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        Arrays.parallelSort(array);


        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;

        }System.out.println(Arrays.toString(array));
    }
}
