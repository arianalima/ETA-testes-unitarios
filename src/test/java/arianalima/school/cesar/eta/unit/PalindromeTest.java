package arianalima.school.cesar.eta.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    public void setupTest(){
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindrome_emptyWord_true(){
        String word = "a";

        boolean actual =  palindrome.isPalindrome(word);
        assertTrue(actual);
    }

    @Test
    public void isPalindrome_differentBorders_false(){
        String word = "ab";

        boolean actual =  palindrome.isPalindrome(word);
        assertFalse(actual);
    }

    @Test
    public void isPalindrome_sameBorders_true(){
        String word = "aa";

        boolean actual =  palindrome.isPalindrome(word);
        assertTrue(actual);
    }
}
