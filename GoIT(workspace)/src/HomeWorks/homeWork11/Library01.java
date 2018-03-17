package HomeWorks.homeWork11;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 * Created by MARIA on 12.11.17.
 */
public class Library01 {
    public static Scanner scanner = new Scanner(System.in);
    public static int peopleCount;
    public static int maxAmount;

    Semaphore semaphore = new Semaphore(maxAmount);

    public static void collectData() {
        System.out.println("Please enter an amount of people who want to enter the library01.");
        peopleCount = scanner.nextInt();
        System.out.println("Please set the limit for the library01`s capacity.");
        maxAmount = scanner.nextInt();
    }
}
