package arianalima.school.cesar.eta.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class LeapYearTest {

    @Test
    public void isLeapYear_divisibleBy4_true(){
        boolean actual = LeapYear.isLeapYear(4);
        assertTrue(actual);
    }

    @Test
    public void isLeapYear_divisibleBy100_false(){
        boolean actual = LeapYear.isLeapYear(100);
        assertFalse(actual);
    }

    @Test
    public void isLeapYear_divisibleBy400_true(){
        boolean actual = LeapYear.isLeapYear(400);
        assertTrue(actual);
    }

    @Test
    public void isLeapYear_nonDivisibleBy4_false(){
        boolean actual = LeapYear.isLeapYear(5);
        assertFalse(actual);
    }
}
