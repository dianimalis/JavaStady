import java.util.Scanner;

/**
 * Created by MARIA on 11.09.17.
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите A.");
        double a = scanner.nextDouble();

        System.out.println("Введите B.");
        double b = scanner.nextDouble();

        System.out.println("Результат введенных дробных чисел " + a + " и " + b + " равна " + (a+b) + ".");


    }
}
