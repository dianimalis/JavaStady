package OfflinePractice;

/**
 * Created by MARIA on 25.09.17.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(recursion(2, 6)); 
    }

    public static int recursion(int x, int n) {
        if(n <= 0) {
            return 1;
        }
        return x*(recursion(x,n-1));

    }
}
