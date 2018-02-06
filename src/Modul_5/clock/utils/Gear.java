package Modul_5.clock.utils;
/**
 * Created by dianimalis on 06.02.2018.
 */
public class Gear { // Шестерёнки сделаны из:
    private String metalType = "gold"; // метал - золото
    private float radius = 1f; // радиус, по умолчанию - 1 дробное

    public Gear(String metalType, float radius) { //щздаем конструктор, который автоматом сеттит
        this.metalType = metalType; // зис метал тайп
        this.radius = radius; // и зис радиус
    }

    public void show(){

        System.out.println("\tmetal type: \t" + metalType);
        System.out.println("\tradius: \t\t" + radius);
    }

    public String getMetalType() { // Геттер для metalType

        return metalType;
    }

    public void setMetalType(String metalType) { // Сеттер для metalType

        this.metalType = metalType;
    }

    public float getRadius() { // Геттер для getRadius

        return radius;
    }

    public void setRadius(float radius) { // Сеттер для getRadius

        this.radius = radius;
    }
}
