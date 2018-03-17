package Practice.Recursion_Practice.Nasledovanie;

/**
 * Created by dianimalis on 13.03.2018.
 */
public class Dog extends Animal{

    public void showName(){
        System.out.println(name);
    }

    public void eat(){
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Gav! I am barking!");
    }
}
