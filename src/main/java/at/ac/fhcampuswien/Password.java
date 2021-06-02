package at.ac.fhcampuswien;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    public boolean validLength(String password){
        return password.length() >= 8 && password.length() <= 25; // check if length is between 8 and 25
    }

    public boolean upLowCase(String password){
        boolean isUp = false; //setting state to false as default
        boolean isLow = false;

        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                isUp = true; // if at position i char is upper set it to true to use it in last statement
            }
            if(Character.isLowerCase(password.charAt(i))){
                isLow = true; // if at position i char is lower set it to true to use it in last statement
            }
            if(isLow && isUp){
                return true; // if condition true, no need to loop once again
            }
        }
        return false;
    }

    public boolean containsNumbers(String password){
        return (password.matches(".*\\d.*")); // check if numbers exist

        /* for(int i = 0; i < password.length(); i++){
            if(password.matches(".*\\d.*")){
                return true;
            }
        }
        return false;
    }*/
    }

    public boolean containsSymbol(String password){
         return (password.matches(".*[()#$?!%/@].*")); // check if symbols exist
    }

    public boolean notTwoNum(String password){
        int counter = 0;
        char previous = password.charAt(0); // to get the very first position at the beginning

        for(int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);    // get the current position
            if (Character.isDigit(c)) {
                if (previous + 1 == c) {    // if current is equal to previous plus one
                    counter++;              // counter++ to get to next position
                } else {
                    counter = 1;            // set it back if it's correct
                }
                if (counter >= 3) {         // if 123 then return false
                    return false;
                }
                previous = c;               // save current as previous for next round
            }
        }
        return true;
    }

    public boolean moreThanThrice(String password){ // same logic as in notTwoNum
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

    public boolean checkPassword(String password){ // calling each method to get full valid password
        return validLength(password) &&
                upLowCase(password)&&
                containsNumbers(password)&&
                containsSymbol(password)&&
                notTwoNum(password)&&
                moreThanThrice(password);
    }
}
