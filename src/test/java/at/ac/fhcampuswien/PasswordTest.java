package at.ac.fhcampuswien;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PasswordTest {

    @Test
    @DisplayName("Does password have valid length?")
    public void validLength(){
        Password p = new Password();
        assertTrue(p.checkLength("hello1234"));
    }

    @Test
    @DisplayName("Has to have upper and lowercase")
    public void upLowCase(){

    }
}
