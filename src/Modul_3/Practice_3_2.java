package Modul_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dianimalis on 04.02.2018.
 */
public class Practice_3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Type array size: ");

        int[] nums;
        nums = new int[in.nextInt()];

        for (int i = 0; i < nums.length; i++){
            System.out.println("Type " + (i + 1) + " index:");
            nums[i] = in.nextInt();


        }
        reverse(nums);
    }
    public static void reverse(int[] input) {
        System.out.println("original array : " + Arrays.toString(input));
        // handling null, empty and one element array
        if (input == null || input.length <= 1) {
            return;
        }
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            // swap numbers
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(input));
    }
}
