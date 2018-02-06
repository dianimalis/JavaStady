package Modul_2;

import java.util.Scanner;

public class Main {   // создаю класс меин
     public static void main (String[] args) {  // пишу корень программы, создаю метод меин
         Scanner sc = new Scanner(System.in); // создаю объектСканер с функцией считывания с консоли

         System.out.println("Как тебя зовут?"); // Вопрос в консоль
         String name = sc.nextLine(); // Задача считать следующую строку

         System.out.println("В каком городе ты живешь?");
         String city = sc.nextLine();

         System.out.println("Какое твое хобби?");
         String hobby = sc.nextLine();

         System.out.println("Сколько тебе лет?");
         int age = sc.nextInt();


         System.out.println("Человек по имени " + name + " живет в городе " + city + ". Этому человеку " + age + " лет и он любит заниматься  " + hobby + ".");

         System.out.println("Имя: " + name + "\nГород: " + city + "\nВозраст: " + age + "\nХобби:  " + hobby);


         System.out.println("-------------------");

         System.out.println("Имя: " + name);
         System.out.println("Город: " + city);
         System.out.println("Возраст: " + age);
         System.out.println("Хобби: " + hobby);

         System.out.println("-------------------");

         System.out.println(name + " - имя");
         System.out.println(city + " - город");
         System.out.println(age + " - возраст");
         System.out.println(hobby + " - хобби");




         


    }
}
