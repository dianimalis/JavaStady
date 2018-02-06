package Modul_3;

import org.omg.IOP.RMICustomMaxStreamFormat;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){

      Scanner scanner = new Scanner(System.in);
        int cnt, k = 0;
        System.out.println("Укажи размер массива: ");
        cnt = scanner.nextInt();
        int[] a = new int[cnt];
        System.out.println("Заполни массив:");
        System.out.println();
        while (k < cnt) {
            System.out.println("Укажи " + k + " элемент массива: ");
            a[k] = scanner.nextInt();
            k++;
        }
        System.out.println("Спасибо, массив заполнен!");
        System.out.println();

        //int[] a = new int[] {1, 5, 3, 4, 5}; // создаю массив на пять интов

        int max = Integer.MIN_VALUE; // создаю переменную интовую, у которой пока значение ноль. После сравнения ей присвоится максимальное значение
        int min = Integer.MAX_VALUE; // созд мин инт перем, пока ноль, будет присвоено минимальное
        int x = 5; // созд пер х, у которой значение 5, будем искать сколько раз она повторяется
        int count = 0; // созд счетчик, у которого пока ноль


        for (int i = 0; i < a.length; i++) { // пишу цикл. Пер i пока ноль, если она меньше тела массива, добавить 1
            if (a[i] > max){ // если a больше макс
                max = a[i]; // то макс = а
            }
            if (a[i] < min){
                min = a[i];
            }
            if (a[i] == 5){ // если а равно 5
                count += 1; // то в счетчик добавить + 1
            }
        }

        for(int j = 0; j < a.length; j++){
            for(int i = 0; i < a.length-1; i++){
                if (a[i] > a[i + 1]){
                    int sort = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = sort;
                }
            }
        }

        int count1 = 0;
        int temp = a[0]++;

        for (int m = 0; m < a.length; m++) {

            for (int i = 0; i < a.length-1; i++) {
                if (temp == a[i]) {
                    count1++;
                }
            }
        }

        for(int i = 0; i < a.length; i++)
            System.out.println("Сортировка: " + a[i]);

        System.out.println("Максимальное чиселко: " + max);
        System.out.println("Минимальное чиселко: " + min);
        System.out.println("Пятёрочка повторяйко: " + count + " раз.");
        System.out.println("Максимальное число повторений: " + count1 + " раз.");
        System.out.println(temp);





            }
        }




