package day28;

import day20.Size;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

    public static void main(String[] args) {

        Map<String,String> userMap = new HashMap<>();

        userMap.put("name", "Taman Neupane");
        userMap.put("age", "32");
        userMap.put("phone", "123456789");

        System.out.println(userMap);

        userMap.put("name_1", "ABC");

        System.out.println(userMap);

//        String age = userMap.get("age");
//
//        System.out.println(age);


//        Map<String,String> userTreeMap = new TreeMap<>();
//
//        userTreeMap.put("name", "Taman Neupane");
//        userTreeMap.put("age", "32");
//        userTreeMap.put("phone", "123456789");
//
//        System.out.println(userTreeMap);
//
//        EnumMap<WeekDay,String> userEnumMap = new EnumMap<>(WeekDay.class);
//
//        userEnumMap.put(WeekDay.SUNDAY, "Taman Neupane");
//        userEnumMap.put(WeekDay.MONDAY, "32");
//
//        System.out.println(userEnumMap);
    }
}
