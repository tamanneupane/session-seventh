package day14;

import java.util.Arrays;

public class ArrayCopying {

    public static void main(String[] args) {

        int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };

//        int[] smallPrimesCopy = smallPrimes;
        int[] smallPrimesCopy = Arrays.copyOf(smallPrimes, 6);

        smallPrimesCopy[0] = 0;

        for (int smallPrime : smallPrimes) {
            System.out.println(smallPrime);
        }

    }
}
