package Modul_4.HomeWork;

/**
 * Created by dianimalis on 20.03.2018.
 */
public class Practice_4_2 {

    public static void main(String[] args) {
involution(2, 4);
    }
    static void involution(int x, int n){
        if(n == 1) {
            return;
        }
        int inv = x * x;
        involution(inv, n-1);
        System.out.println(inv);
    }
}
