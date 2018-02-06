package Modul_5;

import Modul_5.clock.Rolex;
import Modul_5.clock.utils.Gear;

/**
 * Created by dianimalis on 06.02.2018.
 */
public class Main_for_Rolex {
    public static void main(String[] args) {
        // Создадим сложны объект Ролекс, назовем Ролекс, который во внутрь примает серийный номер и массив шестерёнок
        Rolex rolex = new Rolex("000234hj", // На вход ему даем серийный номер
                new Gear[]{ // и передаем ему массив шестерёнок
                        new Gear("silver", 15),
                        new Gear("silver", 5),// поскольку это объекты,но мы не можем их перечислить как с int, через запятую 1, 2, 3
                        new Gear("metal", 1),// тут нужно каждый элемент массива создавать новый объект класса Gear
                        new Gear("gold", 7),
                        new Gear("silver", 9),


                });
        rolex.show(); // одной строкой выводим целый сложный объект
    }
}
