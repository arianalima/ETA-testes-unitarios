package arianalima.school.cesar.eta.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {
    class SpyBodyMassIndex extends BodyMassIndex{
        double weight;
        double height;
        double bmi;

        @Override
        public double calculate(double weight, double height) {
            this.weight = weight;
            this.height = height;
            return -1;
        }

        @Override
        public String classify(double bmi) {
            this.bmi = bmi;
            return "none";
        }
    }
    private BodyMassIndex bmi;

    @BeforeEach
    public void setup(){
        bmi = new BodyMassIndex();
    }

    @Test
    public void classify_bmi30_obese(){
        String actual = bmi.classify(30);
        assertEquals("obese", actual);
    }

    @Test
    public void classify_bmi25_overweight(){
        String actual = bmi.classify(25);
        assertEquals("overweight", actual);
    }

    @Test
    public void classify_bmi18dot5_healthyWeight(){
        String actual = bmi.classify(18.5);
        assertEquals("healthy weight", actual);
    }

    @Test
    public void classify_bmi16_underweight(){
        String actual = bmi.classify(16);
        assertEquals("underweight", actual);
    }

    @Test
    public void classify_bmi15_severelyUnderweight(){
        String actual = bmi.classify(15);
        assertEquals("severely underweight", actual);
    }

    @Test
    public void calculate_weight1Height2_0dot25(){
        double actual = bmi.calculate(1,2);
        assertEquals(0.25, actual);
    }

    @Test
    public void classify_anyWeightAnyHeight_severelyUnderweight(){
        bmi = new BodyMassIndex(){
            @Override
            public double calculate(double weight, double height) {
                return 15;
            }

            @Override
            public String classify(double bmi) {
                return "severely underweight";
            }
        };
        String actual = bmi.classify(1, 2);
        assertEquals("severely underweight", actual);
    }

    @Test
    public void classify_weight1height2_none(){
        SpyBodyMassIndex bmi = new SpyBodyMassIndex();
        String actual = bmi.classify(1,2);

        assertEquals(1, bmi.weight);
        assertEquals(2, bmi.height);
        assertEquals(-1, bmi.bmi);
        assertEquals("none", actual);
    }
}
