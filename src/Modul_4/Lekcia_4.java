package Modul_4;

/**
 * Created by dianimalis on 04.02.2018.
 */
public class Lekcia_4 {

    static int sum(int a, int b, int c){ // создаем метод "sum"/ усложняем a^b+c

//        int result = a + b + c; // вместо двух строчек можно написать в одну проще:
//        return result; // return a + b + c;
        return (int) Math.pow(a, b) + c;// класс Math возводит в степень
    }

    static String drawRectangle(int width, int height, char c){// пишем метод, который ресует нами заданный символ по высоте и ширине
        String result = "";
        for(int i = 0; i < height; i++){
            String line = "";
            for(int j = 0; j < width; j++){
                line += c;
            }
            result += line + "\n";
        }
        return result; // если метод не "void", то он обязательно должен возвращать
        // поэтому всегда в конце метода мы ставим "return"

    }


    public static void main(String[] args) {

        int x = sum(2, 2, 3); // результат метода "sum" присваиваем в переменную х.
        System.out.println("X = " + x);

        String str =  drawRectangle(3, 4, '+');
        System.out.println(str);

        System.out.println(drawRectangle(5, 6, '0')); // можно короче его выводить, в одну строку код
    }
}
