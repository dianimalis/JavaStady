package OfflinePractice;

import java.util.Scanner;

/**
 * Created by MARIA on 25.09.17.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(recursion(a,b));

    }

    public static String recursion(int o, int q) {

        if(o > q) {

            if (o == q) {
                return Integer.toString(o);
            }
            return o + " " + recursion(o - 1,q);
        }
        else {
            if(o == q) {
                return Integer.toString(o);
            }
            return o + " " + recursion(o + 1,q);

        }


//        if(o < q) {
//            System.out.print(o + " ");
//            forNumbers(o + 1, q);
//        }

    }
}
