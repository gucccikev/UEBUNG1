package at.ac.fhcampuswien;

public class Password {

    private String password;

    public Password(String password){
        this.password = password;
    }

    public boolean validLength(){
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
