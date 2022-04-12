package day9.accessmodifier;


public class SocialUser {

    private String name;
    private String email;
    private String userName;
    private String password;


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

    /*
    You can call this method to check your password and you need to pass the password that user has entered
    asdasd
    asdasd
    asdasdasd
    asdasd
    asdasd
    asdasd
    */
    public boolean checkPassword(String userEnteredPassword){
        if(this.password == userEnteredPassword){
            return  true;
        }else{
            return false;
        }
    }
}
