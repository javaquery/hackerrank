package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vicky.thakor
 * @since 2022-05-25
 */
public class TestTwoDArray {
    private static final int[][] INPUT = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
    };

    @Test
    public void test_hourglassSum(){
        List<List<Integer>> arr = new ArrayList<>();
        for (int[] ints : INPUT) {
            List<Integer> values = new ArrayList<>();
            for (int column = 0; column < INPUT[0].length; column++) {
                values.add(ints[column]);
            }
            arr.add(values);
        }

        Assertions.assertEquals(19, TwoDArray.hourglassSum(arr));
    }
}
