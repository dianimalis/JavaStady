package Modul_3;

import java.util.Random;
/**
 * Created by dianimalis on 04.02.2018.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = random.nextInt(10);

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);

        // Bubble Sort
        for (int j = 0; j < a.length; j++) {

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    // swap (перекручивание, смена местами переменных)
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;

                }
            }

        }
        System.out.println("");
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
