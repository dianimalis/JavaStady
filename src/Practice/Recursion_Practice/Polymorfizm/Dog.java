package Practice.Recursion_Practice.Polymorfizm;

/**
 * Created by dianimalis on 14.03.2018.
 */
public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Dog is eating...");

    }
    public void bark(){
        System.out.println("Dog is barking...");
    }
}
