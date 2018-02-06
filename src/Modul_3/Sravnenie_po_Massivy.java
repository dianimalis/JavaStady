package Modul_3;

import java.util.Arrays;

/**
 * Created by dianimalis on 02.02.2018.
 */
public class Sravnenie_po_Massivy {
    public static void main(String[] args) {
        int[] arr = new int []{1, 3, 6, 7, 8, 5, 4, 4, 4, 7, 10, 9, 7, 12, 13, 8};
        int [] counter = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        System.out.println("value\tcount");
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "\t" + counter[i]);
        }
        System.out.println(Arrays.toString(counter));
        System.out.println(Arrays.toString(arr));

    }

}
