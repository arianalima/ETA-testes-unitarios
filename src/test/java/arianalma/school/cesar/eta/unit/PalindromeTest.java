package arianalma.school.cesar.eta.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void isPalindrome_emptyWord_true(){
        String word = "";

        boolean actual =  Palindrome.isPalindrome(word);
        assertTrue(actual);
    }

    @Test
    public void isPalindrome_differentBorder_false(){
        String word = "word";

        boolean actual =  Palindrome.isPalindrome(word);
        assertFalse(actual);
    }

    @Test
    public void isPalindrome_sameBorder_true(){
        String word = "ana";

        boolean actual =  Palindrome.isPalindrome(word);
        assertTrue(actual);
    }
}
