import java.util.Scanner;

/**
 * Created by MARIA on 11.09.17.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну стороны a.");
        double a = scanner.nextInt();

        System.out.println("Введите длину стороны b.");
        double b = scanner.nextInt();

        System.out.println("Введите длину стороны c.");
        double c = scanner.nextInt();

        double p = (a + b + c) / 2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Площадь треугольника равна " + s + ".");




    }
}
