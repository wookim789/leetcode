package leetcode75.dayone.problem;

import leetcode75.dayone.problem.IsSubsequence;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class IsSubsequenceTest {

    @Test
    public void twoStringIsSubsequenceTest(){
        String s = "ace";
        String t = "awweecfwfwe";

        boolean actual = IsSubsequence.isSubsequence(s, t);

        assertTrue(actual);
    }

    @Test
    public void twoStringIsNotSubsequenceTest(){
        String s = "ace";
        String t = "abbbeec";

        boolean actual = IsSubsequence.isSubsequence(s, t);

        assertFalse(actual);
    }
}