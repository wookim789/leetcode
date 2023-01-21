package leetcode.dayone.problem;

import leetcode.dayone.problem.search.FirstBadVersion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstBadVersionTest {
    FirstBadVersion firstBadVersion = new FirstBadVersion();

    @Test
    void firstBadVersionTest(){
        int actual = firstBadVersion.firstBadVersion(2126753390);


        int expected = 1702766719;

        assertEquals(actual, expected);
    }

}