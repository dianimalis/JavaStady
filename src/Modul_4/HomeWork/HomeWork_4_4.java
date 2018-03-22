package Modul_4.HomeWork;

/**
 * Created by dianimalis on 19.03.2018.
 */
public class HomeWork_4_4 {
    public static void main(String[] args) {
        getMax(5,6);
        getMax(2.3f, 3.4f);
    }
    static void getMax(int a, int b){
        int max = a > b ? a : b;
        System.out.println(max);
    }
    static void getMax(float a, float b){
        float max = a > b ? a : b;
        System.out.println(max);
    }
}
