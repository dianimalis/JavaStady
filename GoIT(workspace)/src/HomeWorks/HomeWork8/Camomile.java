package HomeWorks.HomeWork8;

/**
 * Created by MARIA on 23.10.17.
 */
public class Camomile extends SuperFlower {
    private int price = 70;

//            or try with setters extending from base class SuperFlower

    public void show() {
        System.out.print("Ромашка");
    }

    public int getPrice() {
        return price;
    }
}


