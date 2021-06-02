package at.ac.fhcampuswien;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public boolean validLength(String password){
        return password.length() >= 8 && password.length() <= 25;
    }

    public boolean upLowCase(String password){
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

    public boolean containsNumbers(String password){

        for(int i = 0; i < password.length(); i++){
            if(password.matches(".*\\d.*")){
                return true;
            }
        }
        return false;
    }

    public boolean containsSymbol(String password){
         return (password.matches(".*[()#$?!%/@].*"));
    }

    public boolean notTwoNum(String password){
        int counter = 0;
        char previous = password.charAt(0);

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                if (previous + 1 == c) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (counter >= 3) {
                    return false;
                }
                previous = c;
            }
        }
        return true;
    }

    public boolean moreThanThrice(String password){
        int counter = 0;
        char previous = password.charAt(0);

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                if (previous == c) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (counter > 3) {
                    return false;
                }
                previous = c;
            }
        }
        return true;
    }


}
