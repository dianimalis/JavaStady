package Modul_5_1;

/**
 * Created by dianimalis on 11.02.2018.
 */
public class StaticExample {
    public int x = 0;
    public static void printX(StaticExample obj) {
        System.out.println("x = " + obj.x);

        obj.setY(100);
    }

    public void setY(int y){

    }
}
