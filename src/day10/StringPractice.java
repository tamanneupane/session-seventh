package day10;

import java.io.OutputStream;

public class StringPractice {

    public static void main(String[] args) {

        String s1 = "Taman";

        String s2 = new String("Taman");

        String s3 = "Taman";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


        String greeting = "Hello";
        String s = greeting.substring(0, 3);

        System.out.println(s);

        String expletive = "Expletive";
        String PG13 = " deleted";
        String message = expletive.concat(PG13);

        System.out.println(message);

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);

        //Don't use this.
        String allAnother = "S" + " / " + "M" + " / "+ "L" + " / "+ "XL";
        System.out.println(allAnother);

        String repeated = "Java ".repeat(100);
        System.out.println(repeated);

        //String Builder to conactinate (Best Way)
        StringBuilder sb = new StringBuilder();

        sb.append("S");
        sb.append(" / ");
        sb.append("M");
        sb.append(" / ");
        sb.append("L");
        sb.append(" / ");
        sb.append("XL");

        String concatinatedString = sb.toString();
        System.out.println(concatinatedString);

        StringBuilder sb1 = new StringBuilder();
        for (int i =0 ; i < 100 ; i++){
            sb1.append("Java ");
        }

        String repeatedString = sb1.toString();
        System.out.println(repeatedString);

    }
}
