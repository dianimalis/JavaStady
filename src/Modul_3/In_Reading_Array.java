package Modul_3;

import java.util.Scanner;

/**
 * Считывание массива с консоли
 */
public class In_Reading_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Type array size: ");
        int[] nums;
        nums = new int[in.nextInt()];

        for (int i = 0; i < nums.length; i++){
            System.out.println("Type " + (i + 1) + " index:");
            nums[i] = in.nextInt();
        }
    }
}
