package day23;

import java.io.IOException;

public class ExceptionPractice {

    public static void main(String[] args) {
        SomeOperation someOperation = new SomeOperation();

        try {
            someOperation.divideTwoNumber(4,0);
        }catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException ex){
            System.out.println("Sending these errors to analytics server");
        }

        try {
            someOperation.someFunctionThatThrowsIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
