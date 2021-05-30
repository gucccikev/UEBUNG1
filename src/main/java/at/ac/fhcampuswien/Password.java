package at.ac.fhcampuswien;

public class Password {

    public static void main(String[] args){

    }

    public boolean checkLength(String password){
        return password.length() >= 8 && password.length() <= 25;
    }


    public String showIfValid(boolean passwordValid){
        if(passwordValid){
            return "Valid password";
        } else {
            return "Not a valid password";
        }
    }
}
