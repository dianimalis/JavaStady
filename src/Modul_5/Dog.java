package Modul_5;

/**
 * Created by dianimalis on 06.02.2018.
 */
public class Dog { // схема. что собака может иметь
    public  String name = "default"; // имя
    private int age = 0; // возраст

    public Dog(){
        // Пустой конструктор, который можно перегружать в дальнейшем
    }
    public Dog(String name){
        this(name, -1); // можно таким образом записывать, чтобы не дублировалось
    }// вызвать парамерты из объекта ниже

    public Dog(int age){
        this("no name", age);
    }

    public Dog(String name, int age){ // конструктор класса
        this.name = name; // я в this.name, name которе является полем класса
        // присваиваю ему значение, из name, которое приходит в параметрах конструктора
        this.age = age;

    }

    public void show (){
        System.out.println("name: \t" + name);
        System.out.println("age: \t" + age);
    }

    public int getAge(){ // ГЕТТЕР - специальный метод, который возвращает значение переменной
        return  age;
    }
    public void setAge(int age){ // // СЕТТЕР позволяет изменять даже приватные поля
        this.age = age;
    }

}
