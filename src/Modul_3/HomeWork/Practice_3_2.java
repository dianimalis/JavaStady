package Modul_3.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dianimalis on 17.03.2018.
 */
public class Practice_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.println("Input array size:");
        count = scanner.nextInt();
        int[] array = new int[count];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Input " + i + " element of array:");
            array[i] = scanner.nextInt();
        }
        reverse(array);
    }
    public static void reverse(int[]input){
        System.out.println("Original array: " + Arrays.toString(input));
        if(input == null || input.length <=1){
            return;
        }
        for (int i = 0; i < input.length / 2 ; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(input));
    }
}
