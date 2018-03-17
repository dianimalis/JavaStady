package Practice.Recursion_Practice;

/**
 * Created by dianimalis on 11.03.2018.
 */
public class Metods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-1);
        System.out.println("Print out in main: " + person1.getName());
        System.out.println("Print out in main: " + person1.getAge());


    }
}

class Person{
        private String name;
        private String secondName;
        private int age;
        private int height;

        public void setName(String username){
            if (username.isEmpty()){
                System.out.println("Error, is empty name!");
            }else{
                name = username;
            }
            name = username;
        }
        public String getName(){
            return name;
        }
        public void setAge(int userage) {
            if (userage < 0) {
                System.out.println("Error: is empty age!");
            } else {
                age = userage;
            }
        }
        public int getAge (){
            return age;
        }

        void setNameAndAge(String username, int userage){
            name = username;
            age = userage;
        }

        int calculateYearsToRetirement(){
            int yearsToRetirement = 65 - age;
            //System.out.println("Up to retirement there are " + ageToRetirement + "years.");
            return yearsToRetirement;
        }

        void speak(){
            System.out.println("My name is " + name + " " + secondName + ". I'am " + age + ", my height is " + height + " cm.");
        }
        void greed(){
            int i;
            for(i=0; i<1; i++){
            System.out.println("Hello! Glad to see you.");
        }

    }
}

