package Modul_4.HomeWork;

/**
 * Created by dianimalis on 18.03.2018.
 */
public class HomeWork_4_2 {
    public static void main(String[] args) {
        drawRectangle(3, 2);
        System.out.println();
        drawRectangle(2);
        System.out.println();
        drawRectangle(3);

    }

    static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    static void drawRectangle(int front) {
        for (int i = 0; i < front; i++) {
            for (int j = 0; j < front; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

    }
}