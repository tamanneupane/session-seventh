package day24;


import java.io.IOException;

public class AgeRestrictionException extends IOException {

    private String message;

    public AgeRestrictionException(){
        super();
    }

    public AgeRestrictionException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
