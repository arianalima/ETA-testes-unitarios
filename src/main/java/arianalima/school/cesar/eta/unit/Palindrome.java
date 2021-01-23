package arianalima.school.cesar.eta.unit;

public class Palindrome {

    public static boolean isPalindrome(String word){
        int length = word.length();

        if (length <= 1){
            return true;
        }

        if (word.charAt(0) != word.charAt(length-1)){
            return false;
        }

        return isPalindrome(word.substring(1, length-1));
    }
}
