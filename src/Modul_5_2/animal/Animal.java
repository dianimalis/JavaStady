package Modul_5_2;

/**
 * Created by dianimalis on 26.03.2018.
 */
public class Animal {
    private String name;
    private int age;
    private float weight;

    public Animal(String name, int age, float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
