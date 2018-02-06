package Modul_1;
import java.util.Scanner;
/**
 * Created by dianimalis on 06.02.2018.
 */
public class Program {
    public static void main (String[] args) {


        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            System.out.println("Вывод: " + line);
        }

    }
}
