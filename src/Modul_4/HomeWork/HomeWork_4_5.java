package Modul_4.HomeWork;

/**
 * Created by dianimalis on 19.03.2018.
 */
public class HomeWork_4_5 {
    static int i = 0;
    static int j = 0;

    public static void main(String[] args) {
        //outPrintTo(5, 0);
        drawRectangle(2, 3);

    }

    static void outPrintTo(int a, int b) {

        if (b > a) return;
        if (b < a) {
            b++;
            System.out.println(b);
            outPrintTo(a, b);

        }
    }

    static void drawRectangle(int width, int height) {

        if (i == height) return;
        if (i <= height) {
            i++;
            //System.out.print("+");
            //drawRectangle(width, height);

            //System.out.println();

        }
            if (j == width) return;
            if (j < width) {
                j++;
                System.out.print("+");

            }drawRectangle(width, height);
            System.out.println();


//drawRectangle(width-1, height-1);
    }
}
