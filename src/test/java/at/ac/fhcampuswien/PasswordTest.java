package at.ac.fhcampuswien;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PasswordTest {

    @Test
    @DisplayName("Does password have valid length?")
    public void validLengthTest(){
        Password p = new Password("hello1234");
        boolean actual = p.validLength();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Has to have upper and lowercase")
    public void upLowCaseTest(){
        Password p = new Password("HelLo1234");
        boolean actual = p.upLowCase();
        assertTrue(actual);
    }
}
