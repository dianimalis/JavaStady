package Practice.Recursion_Practice;

/**
 * Created by dianimalis on 11.03.2018.
 */
public class ClassesAndObjects {
    public static void main(String[] args) {

    }
}
    class Human{
        String name;
        int age;

        public Human(String bob) {
        }

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void getInfo(){
            System.out.println(name + " " + age);
        }
    }

