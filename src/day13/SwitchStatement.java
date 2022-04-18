package day13;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide which day is today : ");

        String today = scanner.nextLine();

        today = today.toLowerCase();
//        switch (today) {
//            case "sunday", "friday" -> System.out.println("Momos");
//            case "monday" -> System.out.println("Pizza");
//            case "tuesday" -> System.out.println("Burger");
//            case "thursday" -> System.out.println("rice");
//            default -> System.out.println("chicken");
//        }

//        switch (today){
//            case "sunday":
//                System.out.println("Momos");
//                break;
//            case "monday":
//                System.out.println("Momos");
//                break;
//            case "tuesday":
//                System.out.println("Momos");
//                break;
//            case "wednesday":
//                System.out.println("Momos");
//                break;
//            case "thursday":
//                System.out.println("Momos");
//                break;
//            case "friday":
//                System.out.println("Momos");
//                break;
//            default:
//                System.out.println("Momos");
//        }
    }
}
