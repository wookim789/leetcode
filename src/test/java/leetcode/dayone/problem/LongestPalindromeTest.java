package leetcode.dayone.problem;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromeTest {
    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void getLongestPalindromeTest1(){
        String input = "abccccdd";

        int actual = longestPalindrome.getLongestPalindrome(input);

        Assertions.assertThat(actual).isEqualTo(7);
    }

    @Test
    void getLongestPalindromeTest2(){
        String input = "a";

        int actual = longestPalindrome.getLongestPalindrome(input);

        Assertions.assertThat(actual).isEqualTo(1);
    }

}