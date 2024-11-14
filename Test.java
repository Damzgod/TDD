import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Test {

    @Test
    public void testIsPrime() {
        // Test cases for Prime method
        assertTrue(Main.Prime(2), "2 should be prime");
        assertFalse(Main.Prime(0), "0 should not be prime");
    }

    @Test
    public void testIsPalindrome() {
        // Test cases for Palind method
        assertTrue(Main.Palind("Test"), "\"Test\" is not a palindrome");
        assertTrue(Main.Palind("radar"), "\"radar\" is a palindrome");

      
    }
}
