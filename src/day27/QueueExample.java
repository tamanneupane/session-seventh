package day27;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(2);
        integers.add(6);
        integers.add(3);
        integers.add(7);

        System.out.println(integers);

        int a = integers.remove();
        int b = integers.remove();
        int c = integers.remove();
        int d = integers.remove();

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        System.out.println(d);

//        for (int integer :integers) {
//            System.out.println(integers.remove());
//        }

//        Integer i = integers.remove();
//        System.out.println(i);
//
//        System.out.println(integers);
//
//        Integer j = integers.remove();
//        System.out.println(j);
//
//        System.out.println(integers);
    }
}
