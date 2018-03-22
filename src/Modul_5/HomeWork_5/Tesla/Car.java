package Modul_5.HomeWork_5.Tesla;

/**
 * Created by dianimalis on 21.03.2018.
 */
public class Car {
    final int releaseDate;
    private String typeEngine;
    private int maxSpeed;
    private int timeTo100;
    private int amountSit;
    private int passengers;
    private int speedNow;
    private CarWheel[] wheels;
    private CarDoor[] doors;

    public Car(int releaseDate){
        this.releaseDate = releaseDate;
    }
    public Car(int releaseDate, String typeEngine, int maxSpeed, int timeTo100, int amountSit, int passengers, int speedNow){
        this.typeEngine = typeEngine;
        this.maxSpeed = maxSpeed;
        this.timeTo100 = timeTo100;
        this.amountSit = amountSit;
        this.passengers = passengers;
        this.speedNow = speedNow;
        this.releaseDate = releaseDate;
    }

    public void changeSpeed(int newSpeed){
        this.speedNow = newSpeed;
    }
    public void getInPassenger(){
        if(this.passengers >this.amountSit){
            return;
        }else {
            this.passengers++;
        }
    }
    public void getOutPassenger(){
        if(this.passengers <= 0){
            return;
        }else {
            this.passengers--;
        }
    }
    public void getOutAllPassengers(){
        if(this.passengers <= 0){
            return;
        }else {
            this.passengers = 0;
        }
    }
    public void getDoor(){
        for (CarDoor carDoor : doors){
            carDoor.show();
        }
    }
    public void getWeels(){
        for (CarWheel carWheel : wheels){
            carWheel.show();
        }
    }


    public int getReleaseDate() {
        return releaseDate;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getTimeTo100() {
        return timeTo100;
    }

    public void setTimeTo100(int timeTo100) {
        this.timeTo100 = timeTo100;
    }

    public int getAmountSit() {
        return amountSit;
    }

    public void setAmountSit(int amountSit) {
        this.amountSit = amountSit;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSpeedNow() {
        return speedNow;
    }

    public void setSpeedNow(int speedNow) {
        this.speedNow = speedNow;
    }

    public CarWheel[] getWheels() {
        return wheels;
    }

    public void setWheels(CarWheel[] wheels) {
        this.wheels = wheels;
    }

    public CarDoor[] getDoors() {
        return doors;
    }

    public void setDoors(CarDoor[] doors) {
        this.doors = doors;
    }
}
