package day29;

import java.util.concurrent.*;

public class CallablePractice {

    public static void main(String[] args) {
        int a = 200;
        int b = 500;

        Callable<Integer> callable1 = () -> transaction(a, b, 200);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> totalBalanceFuture = executorService.submit(callable1);

        try {
            System.out.println("The total balance is : "+ totalBalanceFuture.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }

    public static int transaction(int a, int b, int amount){

        System.out.println("********************Transaction*********************");
        System.out.println(Thread.currentThread().getName());

        try {
            if(Thread.currentThread().getName().equals("Taman"))
                Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(Thread.currentThread().isInterrupted()){
            return 0;
        }

        a += amount;
        b -= amount;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



        int total = a + b;
        System.out.println("Total = " + total);

        return total;
    }
}
