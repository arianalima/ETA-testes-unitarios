package arianalima.school.cesar.eta.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void classify_bmi30_obese(){
        String actual = BodyMassIndex.classify(30);
        assertEquals("obese", actual);
    }

    @Test
    public void classify_bmi25_overweight(){
        String actual = BodyMassIndex.classify(25);
        assertEquals("overweight", actual);
    }

    @Test
    public void classify_bmi18dot5_healthyWeight(){
        String actual = BodyMassIndex.classify(18.5);
        assertEquals("healthy weight", actual);
    }

    @Test
    public void classify_bmi16_underweight(){
        String actual = BodyMassIndex.classify(16);
        assertEquals("underweight", actual);
    }

    @Test
    public void classify_bmi15_severelyUnderweight(){
        String actual = BodyMassIndex.classify(15);
        assertEquals("severely underweight", actual);
    }
}
