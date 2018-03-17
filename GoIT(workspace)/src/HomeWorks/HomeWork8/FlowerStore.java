package HomeWorks.HomeWork8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MARIA on 23.10.17.
 */
public class FlowerStore {
    public int wallet = 0;
    Rose rose = new Rose();
    Camomile camomile = new Camomile();
    Tulip tulip = new Tulip();

    public static List bouquetSell;
    public static List bouquetSellSeq;

    public List sell(int roseCount, int camomileCount, int tulipCount) {
        List bouquet = new ArrayList();

        for(int i =0;i < roseCount; i++) {
            bouquet.add(new Rose());
        }
        for(int i =0;i < camomileCount; i++) {
            bouquet.add(new Camomile());
        }
        for(int i =0;i < tulipCount; i++) {
            bouquet.add(new Tulip());
        }

        // пополнение кошелька магазина при продаже
        wallet += (rose.getPrice() * roseCount) + (camomile.getPrice() * camomileCount) + (tulip.getPrice() * tulipCount);

        bouquetSell = bouquet;

        return bouquet;
    }

    public List sellSequence(int roseCount, int camomileCount, int tulipCount){
        List bouquet = new ArrayList();

        for(int i = 0; i < Math.max(tulipCount,Math.max(camomileCount,roseCount));i++) {
            if (i< roseCount) {
                bouquet.add(new Rose());
            }
            if (i < camomileCount) {
                bouquet.add(new Camomile());
            }
            if (i < tulipCount) {
                bouquet.add(new Tulip());
            }
            // пополнение кошелька магазина при продаже
       wallet += (rose.getPrice() * roseCount) + (camomile.getPrice() * camomileCount) + (tulip.getPrice() * tulipCount);
        }

        bouquetSellSeq = bouquet;

        return bouquet;
    }

////    FlowersSaver[] saveBouquet = bouquetSellSeq.toArray(new FlowersSaver[bouquetSellSeq.size()]);
//    public FlowerStore[] convert(List list) {
////        FlowersSaver[] saveBouquet = list.toArray(new FlowersSaver[list.size()]);
//        FlowerStore[] array = new FlowerStore[list.size()];
//        list.toArray(array); // fill the array
//    }

////    продает букеты цветов
////    принимает 3 числа : кол-во каждого вида цветка, а вернуть должна один массив цветов в котором будут храниться цветы
////    один обьект в массив == один цветок в букете. Посследовательность расстановки цветов в букете не имеет значения.
//    public SuperFlower[] sell(int r, int c, int t) {
//        int flowersNum = r + c + t;
//        SuperFlower[] bouquet = new SuperFlower[flowersNum];
//
////        for(int i = 0;i<r;i++) {
////            for()
////        }
//
//        //code
//        return bouquet;
//    }
//
//    public SuperFlower[] sellSequence(int r, int c, int t){
//        int flowersNum = r + c + t;
//        SuperFlower[] bouquetSeq = new SuperFlower[flowersNum];{rosesGather(r);camGather(c);tulGather(t);}
//
//        // пополнение кошелька магазина при продаже
//        wallet += (rose.getPrice() * r) + (camomile.getPrice() * c) + (tulip.getPrice() * t);
//
//        return bouquetSeq;
//    }
//
//
//
////    Собиральщики цветов в букет(создавальщики нужное кол-во обьектов в массив)
//    public void rosesGather(int num) {
//        for(int i = 0;i<=0;i++){
//            new Rose();
//        }
//    }
//    public void camGather(int num) {
//        for(int i = 0;i<=0;i++){
//            new Camomile();
//        }
//    }
//    public void tulGather(int num) {
//        for(int i = 0;i<=0;i++){
//            new Tulip();
//        }
//    }
}
