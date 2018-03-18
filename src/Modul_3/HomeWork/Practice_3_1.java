package Modul_3.HomeWork;

import java.util.Scanner;

/**
 * Created by dianimalis on 17.03.2018.
 */
public class Practice_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get in number:");
        String initString = scanner.nextLine();
        Integer revInt = Integer.valueOf(new StringBuilder(initString).reverse().toString());


        System.out.println("Get second number:");

        int secondNumber = scanner.nextInt();
        int n1 = 0;
        while (secondNumber != 0){
            n1 = n1*10 + secondNumber%10;
            secondNumber /= 10;
        }
        System.out.print(revInt);
        System.out.print(" ");
        System.out.println(n1);

    }
}
