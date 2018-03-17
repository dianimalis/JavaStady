package Lessons_drafts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by MARIA on 20.11.17.
 */
public class PoolExample {

    public static Runnable saySomething(String whatToSay,int count) {
        return () -> {
            for(int i = 0; i < count; i++){
                System.out.println(Thread.currentThread().getName() +"[" + i + "]" + " says: " + whatToSay);
            }
        };
    }


    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(saySomething("Hello",1000));
        pool.submit(saySomething("Hi",1300));
        pool.submit(saySomething(":)",500));
        pool.submit(saySomething(":(",900));

    }
}
