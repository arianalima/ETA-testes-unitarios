package arianalima.school.cesar.eta.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PalindromeTest {
    @Spy
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

//    @Test
//    public void isPalindrome_sameBorders_true(){
//        String word = "aa";
//        boolean actual =  palindrome.isPalindrome(word);
//        verify(palindrome, times(1)).isPalindrome(word);
//        verify(palindrome, times(1)).isPalindrome("");
//    }
}
