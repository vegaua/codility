package codility;

import java.math.BigDecimal;
import java.util.*;

/**
 * MaxZeroProduct
 *
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * that, given an array of N positive integers, returns the maximum number of trailing zeros
 * of the number obtained by multiplying three different elements from the array. Numbers
 * are considered different if they are at different positions in the array.
 * For example, given A = [7, 15, 6, 20, 5, 10], the function should return 3
 * (you can obtain three trailing zeros by taking the product of numbers 15, 20 and 10 or 20, 5 and 10).
 * <p>
 * For another example, given A = [25, 10, 25, 10, 32], the function should return 4
 * (you can obtain four trailing zeros by taking the product of numbers 25, 25 and 32).
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [1..1,000,000,000].
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N*log(max(A)));
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */

public class TrailingZeros {

    public int solution(int[] A) {
        if (A.length < 3) {
            throw new IllegalArgumentException("Array length is less than 3");
        }
        Set<Integer> listOfTZs = new HashSet<>();
        for (int el1 = 0; el1 < A.length - 2; el1++) {
            for (int el2 = el1 + 1; el2 < A.length - 1; el2++) {
                for (int el3 = el2 + 1; el3 < A.length; el3++) {
                    BigDecimal multResult = BigDecimal.valueOf(A[el1]).multiply(BigDecimal.valueOf(A[el2])
                            .multiply(BigDecimal.valueOf(A[el3])));
                    listOfTZs.add(Math.abs(multResult.stripTrailingZeros().scale()));
                }
            }
        }
        return listOfTZs.isEmpty() ? 0 : Collections.max(listOfTZs);
    }
}
