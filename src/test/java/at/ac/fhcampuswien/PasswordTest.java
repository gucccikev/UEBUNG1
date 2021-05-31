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
        Password p = new Password("OoOOOOo");
        boolean actual = p.upLowCase();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Has to have numbers")
    public void containsNumbersTest(){
        Password p = new Password("768gdf6");
        boolean actual = p.containsNumbers();
        assertTrue(actual);
    }

    @Test
    @DisplayName("Has minimum one of the symbols")
    public void containsSymbolTest(){
        Password p = new Password("{kg");
        boolean actual = p.containsSymbol();
        assertTrue(actual);
    }

    @Test
    @DisplayName("More than two numbers (right after) not allowed")
    public void notTwoNumTest(){
        Password p = new Password("758");
        boolean actual = p.notTwoNum();
        assertTrue(actual);
    }
}
