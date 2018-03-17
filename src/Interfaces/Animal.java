package Interfaces;

/**
 * Created by dianimalis on 13.03.2018.
 */
public class Animal implements Info {
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }
    public void showInfo(){
        System.out.println("id is " + this.id);
    }
}
