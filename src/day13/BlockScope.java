package day13;

public class BlockScope {

    static int someInteger = 0;

    public static void main(String[] args) {
        int someOtherInteger = 10;
        someInteger = 5;
    }

    public void someOtherMethod(){
        someInteger = 10;
//      someOtherInteger = 5;    // cannot be accessed because someOtherInteger is in different block
    }
}
