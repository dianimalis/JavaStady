package Modul_4.HomeWork;

import java.util.Scanner;

/**
 * Created by dianimalis on 19.03.2018.
 */
public class HomeWork_4_7 {

    public static void main(String[] args) {
        question();

    }
    static void question(){
        Scanner scanner = new Scanner(System.in);
        int quest;
        System.out.println("Which exercise you would like to do? From 1 till 3.");
        quest = scanner.nextInt();
        if (quest == 1){
            ex_1();
        }
        if(quest == 2){
            drawRectangle();
        }
        if(quest == 3){
            getMax();
        }
        System.out.println("Do you want continue? If \"Yes\" press 1, if \"No\" press 0");
        int yes = 1;
        int no = 0;
        int yesNo = scanner.nextInt();
        if(yesNo == no){
            return;
        }
        if(yesNo == yes){
            question();
        }

    }
    static void ex_1(){
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.println("For what number you want count?");
        count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }
    static void drawRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width:");
        int width = scanner.nextInt();
        System.out.println("Input height:");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();

        }
    }
    static void getMax(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = scanner.nextInt();
        System.out.println("Input second number:");
        int b = scanner.nextInt();
        int max = a > b ? a : b;
        System.out.println("The bigger number is: " + max);
    }
}
