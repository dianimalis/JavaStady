package Modul_5.HomeWork_5.Tesla;

/**
 * Created by dianimalis on 21.03.2018.
 */
public class CarWheel {

    private float wearingWheel;
    private int x;

    public CarWheel(){
        this.wearingWheel = 1f;
        this.x = 100;
    }
    public CarWheel(float wearingWheel){
        this(wearingWheel,100);
    }

    public CarWheel( int x){
        this(1f, x);
    }
    public CarWheel(float wearingWheel, int x){
        this.wearingWheel = wearingWheel;
        this.x = x;
    }
    public void pitStop(){
        this.wearingWheel = 1f;
    }
    public void wearing(){
        this.wearingWheel = x/100f;
    }
    public void show(){
        System.out.println("Condition: " + wearingWheel);
    }

    public float getWearingWheel() {
        return wearingWheel;
    }

    public void setWearingWheel(float wearingWheel) {
        this.wearingWheel = wearingWheel;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
