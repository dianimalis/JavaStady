import java.util.Scanner;

/**
 * Created by MARIA on 11.09.17.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину прямоугольника.");
        int width = scanner.nextInt();

        System.out.println("Введите высоту прямоугольника.");
        int height = scanner.nextInt();

        System.out.println("Площадь прямоугольника равна " + (width * height) + ".");
    }
}
