package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 6X6 2D Array, arr:
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 *
 * We define an hourglass in A to be a subset of values with indices falling in this pattern in arr's graphical
 * representation:
 * a b c
 *   d
 * e f g
 *
 * There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. Calculate the
 * hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
 *
 * For example, given the 2D array:
 * -9 -9 -9 1 1 1
 * 0 -9 0 4 3 2
 * -9 -9 -9 1 2 3
 * 0 0 8 6 6 0
 * 0 0 0 -2 0 0
 * 0 0 1 2 4 0
 *
 * We calculate the following 16 hourglass values:
 * -63, -34, -9, 12,
 * -10, 0, 28, 23,
 * -27, -11, -2, 10,
 * 9, 17, 25, 18
 *
 * Our highest hourglass value is 28 from the hourglass:
 * 0 4 3
 *   1
 * 8 6 6
 *
 * Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this
 * challenge.
 *
 * Function Description
 * Complete the function hourglassSum in the editor below. It should return an integer, the maximum
 * hourglass sum in the array.
 * hourglassSum has the following parameter(s):
 *  int arr[6][6]: an array of integers
 *
 * Returns:
 *  int: the maximum hourglass sum
 *
 * Input Format
 * Each of the 6 lines of inputs arr[i][j] contains 6 space-separated integers arr[i][j].
 *
 * Constraints
 * - -9 <= arr[i][j] <= -9
 * - 0 <= i,j <= 5
 *
 * Output Format
 * Print the largest (maximum) hourglass sum found in arr.
 *
 * Sample Input
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 *
 * Sample Output
 * 19
 *
 * Explanation
 * arr contains the following hourglasses:
 * 1 1 1  1 1 0  1 0 0  0 0 0
 *   1      0      0      0
 * 1 1 1  1 1 0  1 0 0  0 0 0
 *
 * 0 1 0  1 0 0  0 0 0  0 0 0
 *   1      1      0      0
 * 0 0 2  0 2 4  2 4 4  4 4 0
 *
 * 1 1 1  1 1 0  1 0 0  0 0 0
 *   0      2      4      4
 * 0 0 0  0 0 2  0 2 0  2 0 0
 *
 * 0 0 2  0 2 4  2 4 4  4 4 0
 *   0      0      2      0
 * 0 0 1  0 1 2  1 2 4  2 4 0
 *
 * The hourglass with the maximum sum (19) is:
 * 2 4 4
 *   2
 * 1 2 4
 *
 * @author vicky.thakor
 * @since 2022-05-25
 */
public class TwoDArray {
    public static int hourglassSum(List<List<Integer>> arr){
        int rows = arr.size();
        int columns = arr.get(0).size();
        int result = Integer.MIN_VALUE;
        for(int row = 0; row <= rows - 3; row++){
            for(int column = 0; column <= columns - 3; column++){
                int sum = arr.get(row).get(column) + arr.get(row).get(column + 1) + arr.get(row).get(column + 2)
                        + arr.get(row + 1).get(column + 1)
                        + arr.get(row + 2).get(column) + arr.get(row + 2).get(column + 1) + arr.get(row + 2).get(column + 2);
                result = Math.max(sum, result);
            }
        }
        return result;
    }
}
