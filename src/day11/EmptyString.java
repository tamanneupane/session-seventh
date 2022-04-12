package day11;

public class EmptyString {

    public static void main(String[] args) {

        String emptyString = "";
        String emptyString1 = "    ";

        System.out.println(emptyString.length());
        System.out.println(emptyString1.trim().length());

        System.out.println(emptyString1.isEmpty());
        System.out.println(emptyString1.isBlank());

    }
}
