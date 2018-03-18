package Modul_3.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dianimalis on 17.03.2018.
 */
public class HomeWork_3_1 {
    public static void main(String[] args) {
        int count;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array size:");
        count = scanner.nextInt();

        int[] array = new int[count];

        System.out.println("Array size is: " + array);

        for (int i = 0; i < array.length ; i++) {
            System.out.println("Input " + i + " element of array: ");
            array[i] = scanner.nextInt();
            System.out.println(i);
        }
        System.out.println("Array is full.");

        int counter = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == 5)
                counter++;
        }
        System.out.println("Repeated is:" + counter);


        int max = array[0], min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (max < array[i])
                max = array[i];

            if(min >array[i])
                min = array[i];
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));






}
}

