package Modul_3;

import javafx.beans.binding.IntegerBinding;

import java.util.Scanner;

/**
 * Created by dianimalis on 04.02.2018.
 */
public class Practice_3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int original = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        StringBuffer buffer = new StringBuffer("Reverse String");
//        buffer.reverse();
//        System.out.println(buffer);

        int reverse = 0;
        int remainder;

        while (original != 0){

            remainder = original % 10;
            reverse = reverse * 10 + remainder;
            original = original / 10;

        }
        System.out.println(reverse);

    }
}