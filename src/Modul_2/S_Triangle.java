package Modul_2;

import java.util.Scanner;

/**
 * Created by dianimalis on 03.02.2018.
 */
public class S_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type side of triangle: ");
        int[] sides = new int[3];
        //sides = new int [scan.nextInt()];

        for (int i = 0; i < sides.length; i++){
            System.out.println("Type " + (i + 1) + " side:");

            sides[i] = scan.nextInt();
        }
        System.out.println();

    }
}
