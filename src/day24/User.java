package day24;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void registerUser() throws AgeRestrictionException {
        //Some code to register user
        if(this.age < 18){
//            System.out.println("Your age is less than 18. So you cannot register to this application");
            throw new AgeRestrictionException("Your age is less than 18. So you cannot register to this application");
        }else{
            // Some code to store the user in the database
            System.out.println(this.name + " is saved to database");
        }
    }
}
