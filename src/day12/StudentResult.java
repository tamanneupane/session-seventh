package day12;

import java.io.Console;
import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
//        Console cons = System.console();
//
//        System.out.println("Enter the userName");
//        String userName = cons.readLine();
//        System.out.println("Enter the password");
//        char[] passwordArray = cons.readPassword();
//
//        String password = String.valueOf(passwordArray);
//
//        System.out.println(password);
//
//        if(!password.equals("admin123")){
//            System.out.println("You are not authenticated user. Please try again");
//            System.exit(0);
//        }

        System.out.println("Enter the full name of the student");
        String name=input1.nextLine();
        System.out.println("Enter marks in math");
        float math= input.nextFloat();
        System.out.println("Enter marks in science");
        float science= input.nextFloat();
        System.out.println("Enter marks in computer");
        float computer= input.nextFloat();
        System.out.println("Enter marks in english");
        float english= input.nextFloat();
        System.out.println("Enter marks in social Study");
        float socialStudy= input.nextFloat();
        float total=math+science+computer+english+socialStudy;
        float percentage=(total/500)*100;

        String output = String.format("The percentage of %s is %.2f", name, percentage);
        System.out.println(output);


    }
}
