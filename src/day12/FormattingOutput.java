package day12;

public class FormattingOutput {

    public static void main(String[] args) {
        double x = 10000.0 / 3.0;

//        System.out.println(x);
//
//        System.out.printf("%.2f", x);

        String amount1 = String.valueOf(x);
        System.out.println(amount1);

        String amount = String.format("%.2f", x);
        System.out.println(amount);

        System.out.println(Math.floor(x));
    }
}
