package day9;

import day9.accessmodifier.SocialUser;

import java.time.LocalDate;

public class User {

    private String name;
    private String email;
    private String userName;
    private String password;

    private Address address;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean checkPassword(String userEnteredPassword){
        if(this.password == userEnteredPassword){
            return  true;
        }else{
            return false;
        }
    }
}
