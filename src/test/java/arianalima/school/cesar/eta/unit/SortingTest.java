package arianalima.school.cesar.eta.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SortingTest {

    @Test
    public void bubbleSort_emptyArray_emptyArray(){
        int[] actual = {};
        int[] expected = {};

        Sorting.bubbleSort(actual);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void bubbleSort_singleElementArray_noArrayChanges(){
        int[] actual = {1};
        int[] expected = {1};

        Sorting.bubbleSort(actual);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void bubbleSort_sortedArray_noArrayChanges(){
        int[] actual = {1, 2};
        int[] expected = {1, 2};

        Sorting.bubbleSort(actual);
        assertArrayEquals(expected,actual);
    }

    @Test
    public void bubbleSort_unsortedArray_sortedArray(){
        int[] actual = {2, 1};
        int[] expected = {1, 2};

        Sorting.bubbleSort(actual);
        assertArrayEquals(expected,actual);
    }
}
