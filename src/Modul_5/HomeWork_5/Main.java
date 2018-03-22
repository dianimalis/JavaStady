package Modul_5.HomeWork_5;

import Modul_5.HomeWork_5.Tesla.CarDoor;

/**
 * Created by dianimalis on 06.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        CarDoor leftDoor = new CarDoor(true, true);
        leftDoor.setDoorOpen(false);
        leftDoor.show();
    }
}
