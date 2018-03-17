import java.util.Scanner;

/**
 * Created by MARIA on 11.09.17.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введи число A и посмотри что будет :Ь");
        int a = scanner.nextInt();

        System.out.println("Введи число B и посмотри что будет :Ь");
        int b = scanner.nextInt();

        System.out.println("Введи число C и посмотри что будет :Ь");
        int c = scanner.nextInt();

        boolean checkBiggerA = a > b & a > c;
        boolean checkBiggerB = b > a & b > c;
        boolean checkBiggerC = c > a & c > b;
        boolean checkLessA = a < b & a < c;
        boolean checkLessB = b < a & b < c;
        boolean checkLessC = c < a & c < b;
        boolean checkMiddleA = a < b & a > c || a < c & a > b;
        boolean checkMiddleB = b < a & b > c || b < c & b > a;
        boolean checkMiddleC = c < a & c > b || c < b & c > a;

        System.out.println("Является ли A наибольшим числом: " + checkBiggerA);
        System.out.println("Является ли B наибольшим числом: " + checkBiggerB);
        System.out.println("Является ли C наибольшим числом: " + checkBiggerC);

        System.out.println("Является ли A наименьшим числом: " + checkLessA );
        System.out.println("Является ли B наименьшим числом: " + checkLessB);
        System.out.println("Является ли C наименьшим числом: " + checkLessC);


        System.out.println("Является ли A промежуточным числом между B и C: " + checkMiddleA );
        System.out.println("Является ли B промежуточным числом между A и C: " + checkMiddleB);
        System.out.println("Является ли C промежуточным числом между A и B: " + checkMiddleC);

    }
}
