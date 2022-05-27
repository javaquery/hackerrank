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
public class TestArrayDS {

    private static final List<Integer> INPUT = new ArrayList<>(Arrays.asList(1, 4, 3, 2));

    @Test
    public void test_reverseArray(){
        List<Integer> result = ArrayDS.reverseArray(INPUT);
        Assertions.assertEquals(INPUT.size(), result.size());
        Assertions.assertEquals(Arrays.asList(2, 3, 4, 1), result);
    }
}
