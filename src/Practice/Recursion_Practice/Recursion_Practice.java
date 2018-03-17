package Practice.Recursion_Practice;

/**
 * Created by dianimalis on 10.03.2018.
 */
public class Recursion_Practice {
    public static int recursion (int n) {

        if (n == 1) {
            return 1;
        }

        return recursion (n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
}
