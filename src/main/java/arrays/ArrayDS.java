package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array,
 * A, of size N, each memory location has some unique index, i (where 0 <= i <= N), that can be referenced as A[i] or
 * Ai.
 *
 * Reverse an array of integers.
 *
 * Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.
 *
 * Example
 * A = [1, 2, 3]
 * Return [3, 2, 1].
 *
 * Function Description
 *
 * Complete the function reverseArray in the editor below.
 *
 * reverseArray has the following parameter(s):
 *
 * int A[n]: the array to reverse
 *
 * Returns
 *
 * int[n]: the reversed array
 *
 * Input Format
 * The first line contains an integer, N, the number of integers in A.
 * The second line contains N space-separated integers that make up A.
 *
 * Constraints
 * 1 <= N <= 10^3
 * 1 <= A[i] <= 10^4, where A[i] is the ith integer in A
 *
 * Sample Input 0
 * 4
 * 1 4 3 2
 *
 * Sample Output 0
 * 2 3 4 1
 *
 * @author vicky.thakor
 * @since 2022-05-27
 */
public class ArrayDS {
    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> result = new ArrayList<>();
        int size = a.size();
        for(int i = size - 1;  i >= 0 ; i--){
            result.add(a.get(i));
        }
        return result;
    }
}
