import java.util.Scanner;

/**
 * Created by MARIA on 11.09.17.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число A и посмотри что будет :Ь");
        int a = scanner.nextInt();

        System.out.println("Введи число B и посмотри что будет :Ь");
        int b = scanner.nextInt();

        System.out.println("Введи число C и посмотри что будет :Ь");
        int c = scanner.nextInt();

        System.out.println("Равняется ли A хотя бы одному из других чисел: " + (a == b || a == c));
        System.out.println("Равняется ли B хотя бы одному из других чисел: " + (b == a || b == c));
        System.out.println("Равняется ли C хотя бы одному из других чисел: " + (c == a || c == b));


        System.out.println("A больше хотя бы одного из других чисел: " +  (a > b || a > c) );
        System.out.println("B больше хотя бы одного из других чисел: " + (b > a || b > c) );
        System.out.println("C больше хотя бы одного из других чисел: " + (c > a || c > b) );



    }
}
