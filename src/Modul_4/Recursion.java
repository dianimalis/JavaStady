package Modul_4;

/**
 * Created by dianimalis on 05.02.2018.
 */
public class Recursion {
    static int fact (int n){
        if (n == 1){ // если n не равняется 1, то код пойдет выполняться дальше
            return 1; // если n равняется 1, то ретурн вернет единицу и выполнение кода прекратится
        }
        return n * fact(n-1); //  в ретурне вызываем факториал n-1 и это все умножаем на n.
    // к примеру, факториал 5 - это факториал 4 умножить на 5

    }

    public static void main(String[] args) {
        System.out.println("F(3)= " + fact(3));

    }
}
