package day29;

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

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

    }

    public static void transaction(int a, int b, int amount){

        System.out.println("********************Transaction*********************");

       a += amount;
       b -= amount;

       System.out.println("a = " + a);
       System.out.println("b = " + b);

       int total = a + b;
        System.out.println("Total = " + total);
    }
}
