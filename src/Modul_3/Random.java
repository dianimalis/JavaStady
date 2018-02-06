package Modul_3;

public class Random {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random(); // создания рандомного массива
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++)
            a[i] = random.nextInt(10);
        for(int i = 0; i < a.length; i++)
            System.out.println("Рандом: " + a[i]);


        for(int j = 0; j < a.length; j++){  // сортировка массива
            for(int i = 0; i < a.length-1; i++){
                if (a[i] > a[i + 1]){
                    int sort = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = sort;
                }
            }
        }
        for(int i = 0; i < a.length; i++)
        System.out.println("Сортировка: " + a[i]);
    }
}
