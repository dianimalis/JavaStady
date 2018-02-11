package Modul_5;

/**
 * Created by dianimalis on 07.02.2018.
 */
public class FinalExample {
    final int releaseDate;

    public FinalExample(){
        this.releaseDate = 10;
    }

    static final float PI = 3.14f; // вынос за пределы метода, как поля класса

    public static void main(String[] args) {
        //final float PI = 3.14f; // если внутри метода
        float pi = PI;
    }
}
