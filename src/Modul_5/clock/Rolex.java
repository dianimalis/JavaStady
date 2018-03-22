package Modul_5.clock;
import Modul_5.clock.utils.Gear;
/**
 * Created by dianimalis on 06.02.2018.
 */
public class Rolex {
    private String serialNumber = "default";
    private Gear[] gears;

    public Rolex(String serialNumber, Gear[] gears) {
        this.serialNumber = serialNumber;
        this.gears = gears;
    }

    public void show() {
        System.out.println("Serial Number: \t" + serialNumber);
        for (Gear gear : gears) {
            gear.show();
        }
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Gear[] getGears() {
        return gears;
    }

    public void setGears(Gear[] gears) {
        this.gears = gears;
    }


}
