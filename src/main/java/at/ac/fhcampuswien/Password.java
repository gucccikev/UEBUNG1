package at.ac.fhcampuswien;
import java.lang.*;

public class Password {

    private String password;

    public Password(String password){
        this.password = password;
    }

    public boolean validLength(){
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean upLowCase(){
        boolean isUp = false;
        boolean isLow = false;

        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                isUp = true;
            }
            if(Character.isLowerCase(password.charAt(i))){
                isLow = true;
            }
            if(isLow && isUp){
               return true; // if condition true, no need to loop once again
           }
        }
        return false;
    }


    public String showIfValid(boolean passwordValid){
        if(passwordValid){
            return "Valid password";
        } else {
            return "Not a valid password";
        }
    }
}
