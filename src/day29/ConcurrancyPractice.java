package day29;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrancyPractice {

    public static void main(String[] args) {

        int a = 200;
        int b = 500;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int total = a + b;
        System.out.println("Total = " + total);

//        transaction(a, b, 200);
//        transaction(b, a, 200);

        Runnable r1 = () -> { transaction(a, b, 200); };
        Runnable r2 = () -> {  transaction(b, a, 200); };
        Runnable r3 = () -> {  transaction(b, a, 200); };

//        Thread thread1 = new Thread(r1);
//        thread1.setName("Taman");
//        Thread thread2 = new Thread(r2);
//        thread2.setName("ABC");
//
//        thread2.start();
//
//        thread1.setDaemon(true);
//        thread1.start();


        // Executor Service

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.submit(r1);
//        executorService.submit(r2);
//        executorService.submit(r3);
//
//        executorService.shutdown();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r3);

        executorService.shutdown();


    }

    public static void transaction(int a, int b, int amount){

        System.out.println("********************Transaction*********************");
        System.out.println(Thread.currentThread().getName());

        try {
            if(Thread.currentThread().getName().equals("Taman"))
                Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(Thread.currentThread().isInterrupted()){
            return;
        }

       a += amount;
       b -= amount;

       System.out.println("a = " + a);
       System.out.println("b = " + b);



       int total = a + b;
        System.out.println("Total = " + total);
    }
}
