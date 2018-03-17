package HomeWorks.HomeWork8;

/**
 * Created by MARIA on 23.10.17.
 */
public class Rose extends SuperFlower {

    //    добавить к классам-цветам поле-цена
    private int price = 100;


    public void show() {
        System.out.print("Роза");
    }


    public int getPrice() {
        return price;
    }

}
