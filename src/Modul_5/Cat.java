package Modul_5;

/**
 * Created by dianimalis on 06.02.2018.
 */
public class Cat {
    public Name name = new Name();
    public static class Name{
        public String firstName;
        public String lastName;

    }
    public void show(){
        System.out.println(name.firstName + "\t" + name.lastName);
    }
}
