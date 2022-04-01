package day6;

import java.util.Map;

public class PredefinedMathClass {

    public static void main(String[] args) {

        double pi = Math.PI;

        double sqrtValue = Math.sqrt(8);
        System.out.println(sqrtValue);

        double ceilValue = Math.ceil(4.0001);
        System.out.println(ceilValue);

        double floorValue = Math.floor(4.9999);
        System.out.println(floorValue);

        long roundValue = Math.round(4.2);
        System.out.println(roundValue);

        double randomValue = Math.random();
        System.out.println(Math.round(randomValue * 10));
    }
}
