package Modul_4;

/**
 * Created by dianimalis on 05.02.2018.
 */
public class OverLoad_Metod {

    static int sum(int a, int b, int c, int d) {// создаем метод сум
        return a + b + c + d;
    }

    static int sum(int a, int b, int c) { // перегружаем метод сум. Имя и тип должен быть одинаковыми, а количество или тип переменных отличаться. Хотябы одной.
        return a + b + c;
        //return sum(a, b, c, 0); //можна таким образом вызвать ретурн (вызвать метод оригинал и просто вместо четвертой переменной указать 0.
    }
    static int sum(int[] array) { // перегружаю метод сум в массив
        int result = 0;
        for(int value : array)
            result += value;
    return result;
    }



    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum (new int[]{1, 2, 3, 4, 5, 1, 2, 3}));
    }
}
