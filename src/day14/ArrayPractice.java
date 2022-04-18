package day14;

public class ArrayPractice {

    public static void main(String[] args) {
//        int a = 2;
//
//        a = 3;

        int[] a = new int[2];

        a[0] = 5;
        a[1] = 7;

        String[] strings = new String[3];



//        System.out.println(strings[3]);

//       for (int index = 0; index < 3 ; index++){
//           System.out.println(strings[index]);
//       }

       int[] numbers = {2,3};

       numbers[0] = 8;
       numbers[1] = 15;

       String[] anotherStrings = {"Taman", "Neupane"};

        for (int index = 1; index >= 0; index--){
            System.out.println(numbers[index]);
            System.out.println(index);
        }

        for (int number  : numbers) {
            System.out.println(number);
        }
    }
}
