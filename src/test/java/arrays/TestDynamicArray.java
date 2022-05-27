package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author vicky.thakor
 * @since 2022-05-27
 */
public class TestDynamicArray {
    private static final int[][] INPUT = {
            {1, 0, 5},
            {1, 1, 7},
            {1, 0, 3},
            {2, 1, 0},
            {2, 1, 1}
    };

    @Test
    public void test_dynamicArray(){
        List<List<Integer>> arr = new ArrayList<>();
        for (int[] ints : INPUT) {
            List<Integer> values = new ArrayList<>();
            for (int column = 0; column < INPUT[0].length; column++) {
                values.add(ints[column]);
            }
            arr.add(values);
        }

        Assertions.assertEquals(Arrays.asList(7, 3), DynamicArray.dynamicArray(2, arr));
    }

}
