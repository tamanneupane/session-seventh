package day14;

import java.math.BigInteger;

public class BigNumbersPractice {

    public static void main(String[] args) {

        long number = 1000000000;
        BigInteger bigInteger = new BigInteger("100000000000000");
        BigInteger bigInteger1 = new BigInteger("200");

        BigInteger result = bigInteger.add(bigInteger1);

        System.out.println(result);

//        BigInteger bigInteger1 = BigInteger.valueOf(100);


    }
}
