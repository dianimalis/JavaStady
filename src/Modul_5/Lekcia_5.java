package Modul_5;

/**
 * Created by dianimalis on 06.02.2018.
 */
public class Lekcia_5 {
    public static void main(String[] args) {



        Dog dog = new Dog();
        Dog dog1 = new Dog("Bobik", 5); // по схеме класса собака можем создать объект
        Dog dog2 = new Dog("Barsik", 10); // создаем еще одну собаку
        Dog dog3 = new Dog("Barsik");
        Dog dog4 = new Dog(10);

        dog2.name = "Barsik2000";

        dog2.setAge(100); // СЕТТЕР позволяет изменять даже приватные поля

        Cat.Name name = new Cat.Name();

        Cat cat = new Cat();
        cat.name.firstName = "cat f1";
        cat.name.lastName = "cat f2";

        cat.show();

        System.out.println();

        System.out.println("dog.name \t" + dog.name + "\t\t" + dog.getAge());
        System.out.println("dog1.name \t" + dog1.name + "\t\t" + dog1.getAge()); // оператор точка
        System.out.println("dog2.name \t" + dog2.name + "\t" + dog2.getAge());// позволяет получить доступ к данным внутри объекта
        System.out.println("dog3.name \t" + dog3.name + "\t\t" + dog3.getAge());
        System.out.println("dog4.name \t" + dog4.name + "\t\t" + dog4.getAge());

        dog.show(); // так выводить проще, чем строчки выше
        dog1.show(); // внутринасти на вывод написале в доге
        dog2.show(); // выводит тоже, что и выше, но меньше кода
        dog3.show();
        dog4.show();




    }
}
