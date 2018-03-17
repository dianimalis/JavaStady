package Practice.Recursion_Practice;

/**
 * Created by dianimalis on 11.03.2018.
 */
public class Constuctor {
    public static void main(String[] args) {
        Humanito humanito1 = new Humanito();

    }
}

class Humanito{



    private String name;
    private int age;

    public Humanito(){
        this.name = "Default name";
        this.age = 0;
    }
    public Humanito(String name){
        System.out.println("Hey from second constructor!");
        this.name = name;
    }
    public Humanito(String name, int age){
        System.out.println("Greed from third constructor!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

}
