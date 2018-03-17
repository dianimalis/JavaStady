import java.util.Scanner;

/**
 * Created by MARIA on 11.09.17.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число A и посмотри что будет :Ь");
        int a = scanner.nextInt();

        System.out.println("Введи число B и посмотри что будет :Ь");
        int b = scanner.nextInt();

        boolean equals = a == b;
        boolean devides = a%b == 0;
        boolean bigger = a > b;
        System.out.println("А вот что будет:\nРавны ли числа A и B:\t\t" + equals);
        System.out.println("Делится ли A на B без остатка:\t\t" + devides);
        System.out.println("Больше ли A чем B:\t\t" + bigger);

    }
}
