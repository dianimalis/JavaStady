package OfflinePractice;

import java.util.Scanner;

/**
 * Created by MARIA on 25.09.17.
 */
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива.");

        int x = scanner.nextInt();
        int[] array = new int[x];

        System.out.println("Заполните этот массив.");
        for(int i = 0; i < array.length;i++) {
            array[i] = scanner.nextInt(); scanner.nextLine();
        }

        System.out.println("Максимальный индекс: " + findMaxI(array) + "\nМаксимальное число: " + findMaxN(array));

    }

    public static int findMaxI(int[] arraymax) {

        int max = arraymax[0];
        int maxI = 0;
        for(int i = 0; i <arraymax.length;i++) {

            if(arraymax[i] > max) {
                max = arraymax[i];
                maxI = i;
            }

        } return maxI;

    }

    public static int findMaxN(int[] arraymaxn) {
        int maxi = findMaxI(arraymaxn);
        int maxnum = arraymaxn[maxi];
        return maxnum;

    }

}
