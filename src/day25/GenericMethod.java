package day25;

public class GenericMethod {

    public static void main(String[] args) {
        Integer[] integers = {2, 3, 4, 5, 6};

        printArray(integers);

        String[] strings = {"A", "B", "C", "D"};

        printArray(strings);
    }

    public static <E> void printArray(E[] arrays){
        for (E value: arrays) {
            System.out.print(value);
            System.out.print(",");
        }
        System.out.println("");
    }

//    public static void printArray(int[] integers) {
//        for (int integer : integers) {
//            System.out.println(integer);
//        }
//    }
//
//    public static void printArray(String[] strings) {
//        for (String string : strings) {
//            System.out.println(string);
//        }
//    }




}
