package Modul_5.HomeWork_5.Tesla;

/**
 * Created by dianimalis on 21.03.2018.
 */
public class CarDoor {
    private boolean doorOpen;
    private boolean windowOpen;

    public CarDoor() {
        this.doorOpen = false;
        this.windowOpen = false;
    }

    public CarDoor(boolean doorOpen, boolean windowOpen) {
        this.doorOpen = doorOpen;
        this.windowOpen = windowOpen;
    }

    public void isDoorOpen(){
        this.doorOpen = true;
    }

    public void isDoorClose(){
        this.doorOpen = false;
    }

    public void openCloseDoor(){
        if(this.doorOpen = true){
            this.doorOpen = false;
        }
        if(this.doorOpen = false){
            this.doorOpen = true;
        }
    }

    public void isWindowOpen(){
        this.windowOpen = true;
    }

    public void isWindowClose(){
        this.windowOpen = false;
    }

    public void openCloseWindow(){
        if(this.windowOpen = true){
            this.windowOpen = false;
        }
        if(this.windowOpen = false){
            this.windowOpen = true;
        }
    }

    public void show(){
        System.out.println("Door is open - " + doorOpen);
        System.out.println("Window is open - " + windowOpen);
    }
    public boolean getDoorOpen(){
        return doorOpen;
    }
    public boolean getWindowOpen(){
        return windowOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

}
