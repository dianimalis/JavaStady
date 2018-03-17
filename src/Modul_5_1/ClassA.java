package Modul_5_1;

/**
 * Created by dianimalis on 11.02.2018.
 */
public class ClassA {

    public static int y = 0;

    public int x = 0;

    public static void staticDemo() {
        System.out.println("Static demo");
    }

    public void demo() {
        System.out.println("Demo y = " + y + ", x = " + x);
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
