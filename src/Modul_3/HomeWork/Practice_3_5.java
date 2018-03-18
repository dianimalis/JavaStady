package Modul_3.HomeWork;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by dianimalis on 17.03.2018.
 */
public class Practice_3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height;
        System.out.println("Input weight:");
        height = scanner.nextInt();

        int width;
        System.out.println("Input height:");
        width = scanner.nextInt();

        Rectangle[][] rectangle = new Rectangle[width][height];

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

        }
    }

