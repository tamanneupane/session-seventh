package day25;

import java.util.HashMap;
import java.util.logging.Logger;

public class GenericPractice {

    public static void main(String[] args) {
        GenericPair<String, String> genericPair = new GenericPair<String, String> ("name", "Taman");

        String genericPairValue = genericPair.getValue();

        GenericPair<String,Integer> genericPair1 = new GenericPair<String,Integer> ("age", 30);

        int genericPair1Value = genericPair1.getValue();

        GenericPair<Integer,Integer> genericPair2 = new GenericPair<Integer,Integer> (2, 30);

        Logger.getGlobal().info(String.valueOf(genericPair));
    }
}
