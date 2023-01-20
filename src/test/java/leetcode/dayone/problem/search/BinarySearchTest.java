package leetcode.dayone.problem.search;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class BinarySearchTest {
    BinarySearch binarySearch = new BinarySearch();

    @Test
    void binarySearchTest(){
        /**
         * Input: nums = [-1,0,3,5,9,12], target = 9
         * Output: 4
         * Explanation: 9 exists in nums and its index is 4
         * */

        int[] givenNums = new int[]{-1,0,3,5,9,12};
        int givenTarget = 9;

        int actual = binarySearch.binarySearch(givenNums, givenTarget);
        int expected = 4;

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}