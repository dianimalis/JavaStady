package Modul_5.HomeWork_5;

import Modul_5.HomeWork_5.CarDoor.CarDoor;

/**
 * Created by dianimalis on 06.02.2018.
 */
public class Main {
    public static void main(String[] args) {

CarDoor doorClose = new CarDoor();
CarDoor doorOpen = new CarDoor();
CarDoor windowOpen = new CarDoor();
CarDoor windowClose = new CarDoor();




        System.out.println("Закрыть " + doorClose.doorClose + " дверь");
        System.out.println("Открыть " + doorOpen.doorOpen + " дверь");
        System.out.println("Закрыть " + windowClose.windowClose + " окно");
        System.out.println("Открыть " + windowOpen.windowOpen + " окно");

    }
}
