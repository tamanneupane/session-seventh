package day24;

import java.util.logging.Logger;

public class SomeApplication {

    public static void main(String[] args) {

        User user1 = new User("ABC", 16);
        try {
            //open database
            user1.registerUser();
        } catch (AgeRestrictionException e) {
            e.printStackTrace();
            Logger.getGlobal().severe(e.getMessage());
        }finally {
            System.out.println("Finally block is getting called");
            //close database
        }


//        User user2 = new User("DEF", 30);
//
//        try {
//            user2.registerUser();
//        } catch (AgeRestrictionException ex) {
//            ex.printStackTrace();
//        }finally {
//
//        }


    }
}
