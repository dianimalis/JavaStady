package Modul_4.HomeWork;

import java.util.Arrays;

/**
 * Created by dianimalis on 20.03.2018.
 */
public class Practice_4_1 {

    static int max = 0;
    static int min = 0;
    private static int array[] = {1, 2, 3, 4, 5, 2, 7, 2};


    public static void main(String[] args) {
        findMax(array);
        findMax_2(array);
        findMin(array);
        findMin_2(array);
        findMaxAndMin(array);
    }

    static void findMax (int[] array){
        Arrays.sort(array);
        max = array[array.length - 1];
        System.out.println(max);
    }
    static void findMax_2 (int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[0]){
                max = array[i];

            }
        }System.out.println(max);
    }
    static void findMin (int[] array){
        Arrays.sort(array);
        min = array[0];
        System.out.println(min);
    }
    static void findMin_2(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[0]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
    static void findMaxAndMin(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[max]){
                max = i;
            }else if(array[i] < array[min]){
                min = i;
            }
        }
        System.out.println("Max: " + max + " min: " + min);
    }
}
