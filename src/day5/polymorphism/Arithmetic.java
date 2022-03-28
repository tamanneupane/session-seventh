package day5.polymorphism;

public class Arithmetic {


    public static void main(String[] args) {
        int a = 2;
        int b = 3;
//        int c = a + b;
//        System.out.println(c);
        addNumbers(a, b);


        int d = 7;
        int e = 3;
//        int f = d + e;
//        System.out.println(f);
        addNumbers(d, e);


        int g = 12;
        int h = 3;
//        int i = g + h;
//        System.out.println(i );
        addNumbers(g, h);

        float j = 2.5f;
        float k = 2.5f;

        addNumbers(j,k);
    }

    public static void addNumbers(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void addNumbers(float a, float b){
        float c = a + b;
        System.out.println(c);
    }


}
