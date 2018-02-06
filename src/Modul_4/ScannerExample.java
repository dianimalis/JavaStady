package Modul_4;

import java.util.Scanner;

/**
 * Created by dianimalis on 06.02.2018.
 */
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();  scanner.nextLine(); // Если! после некст ин нужно будет вызывать некст лайн, то нужно вот так написать вызов некст лайн в холостую, что бы небыло конфликта.

        String l = scanner.nextLine();

        float f = scanner.nextFloat();
        double d = scanner.nextDouble();



        System.out.println("i = " + i);
        System.out.println("i = " + l);
        System.out.println("i = " + f);
        System.out.println("i = " + d);


        for(int index = 0; index < 10; index++){ // как работает hasNextInt
            if(scanner.hasNextInt()) { // если введено число
                int value = scanner.nextInt(); // то принять его
                System.out.println(" value (int) = " + value); // и вывести число в консоль
            }else { // если не число, а символ
                String  value = scanner.next(); // принять символ в строку
                System.out.println(" value (str) = " + value); // и вывести строку
            }
        }





        scanner.close();
    }

}
