package Practice.Recursion_Practice;

/**
 * Created by dianimalis on 11.03.2018.
 */
public class Static {
    public static void main(String[] args) {
        Hum h1 = new Hum("Bob", 40);
        Hum h2 = new Hum("Tom", 30);
        h1.printNumerOfPeople();
        h2.printNumerOfPeople();

    }
}

class Hum{
    private String name;
    private int age;
    private static int countPeople;

    public Hum(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;}

    public void setAge(int age) {
        this.age = age;}

    public void printNumerOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }


}
