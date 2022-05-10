package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

public class SmallCollection {

    public static void main(String[] args) {

        List<Integer> ints = List.of(2,3,5,4,8);
        System.out.println(ints);

////        ints.remove(1);
//
//        int data = ints.get(3);
//        System.out.println(data);
//
//        Map<String, Integer> scores = Map.of("Peter", 2, "Paul", 3,"Mary", 5);
//        System.out.println(scores);
//
//        Map<String, Integer> scores1 = Map.ofEntries(entry("Peter", 2),entry("Paul", 3),entry("Mary", 5));
//        System.out.println(scores1);

        ArrayList<Integer> integerArrayList = new ArrayList<>(ints);
        System.out.println(integerArrayList);
        integerArrayList.add(15);
        System.out.println(integerArrayList);

        List<String> settings = Collections.nCopies(10, "DEFAULT");
        System.out.println(settings);

    }
}
