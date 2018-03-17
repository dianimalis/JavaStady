package Practice.Recursion_Practice.Nasledovanie;

/**
 * Created by dianimalis on 13.03.2018.
 */
public class Nasledov {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        dog.bark();
        dog.showName();
        Cat cat = new Cat();
        cat.voice();
        cat.showName();
        cat.eat();
    }
}
