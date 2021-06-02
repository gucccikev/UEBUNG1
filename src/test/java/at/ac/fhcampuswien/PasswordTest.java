package at.ac.fhcampuswien;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PasswordTest {

    @Test
    @DisplayName("Does password have valid length?")
    public void validLengthTest(){
        Password p = new Password();
        boolean actual = p.validLength("hello1324");
        assertTrue(actual);
    }


    @Test
    @DisplayName("Has to have upper and lowercase")
    public void upLowCaseTest(){
        Password p = new Password();
        boolean actual = p.upLowCase("OoOOOOo");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Has to have numbers")
    public void containsNumbersTest(){
        Password p = new Password();
        boolean actual = p.containsNumbers("hgd789");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Has minimum one of the symbols")
    public void containsSymbolTest(){
        Password p = new Password();
        boolean actual = p.containsSymbol("sam#");
        assertTrue(actual);
    }

    @Test
    @DisplayName("More than two numbers (right after) not allowed")
    public void notTwoNumTest(){
        Password p = new Password();
        boolean actual = p.notTwoNum("7ig1abc123");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Same number more than thrice not allowed")
    public void moreThanThriceTest(){
        Password p = new Password();
        boolean actual = p.moreThanThrice("hiaaaa");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Valid password")
    public void checkPasswordTest(){
        Password p = new Password();
        boolean actual = p.checkPassword("Kev2002))");
        assertTrue(actual);
    }
}
