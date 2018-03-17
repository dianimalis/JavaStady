package Practice.Recursion_Practice.Polymorfizm;

/**
 * Created by dianimalis on 14.03.2018.
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        byte x = (byte)129;
        System.out.println(x);
    }
    public static void test(Animal animal){
        animal.eat();

    }
}
