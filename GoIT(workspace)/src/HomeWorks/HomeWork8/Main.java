package HomeWorks.HomeWork8;

import static HomeWorks.HomeWork8.FlowersSaver.saveBouquet;


/**
 * Created by MARIA on 23.10.17.
 */
public class Main {
    public static void main(String[] args) {
//        В гланом классе программы продемонстрировать работу метода sell, sellSequence
//        вывести по букету в консоль через запятую в одну строчку.
//        ПОЛЯ string name У КЛАССОВ-ЦВЕТОВ НЕТ

        FlowerStore flowersStore = new FlowerStore();

        System.out.println(flowersStore.sell(1,1,2));
        System.out.println(flowersStore.wallet);
        System.out.println(flowersStore.sellSequence(5,2,4));
        System.out.println(flowersStore.wallet);

        System.out.println(flowersStore.bouquetSell);

        saveBouquet(flowersStore.bouquetSellSeq);





    }
}
