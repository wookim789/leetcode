package leetcode.dayone.problem.search;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstBadVersion {
    /*
     * [problem]
     * * 해당 문제는 특정 API를 사용하느 문제라 로컬 테스트는 불가하다 *
     *
     * You are a product manager and currently leading a team to develop a new product.
     * Unfortunately, the latest version of your product fails the quality check.
     * Since each version is developed based on the previous version,
     * all the versions after a bad version are also bad.
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
     * which causes all the following ones to be bad.
     * You are given an API bool isBadVersion(version) which returns whether version is bad.
     * Implement a function to find the first bad version. You should minimize the number of calls to the API.
     *
     * [example]
     * Input: n = 5, bad = 4
     * Output: 4
     * Explanation:
     * call isBadVersion(3) -> false
     * call isBadVersion(5) -> true
     * call isBadVersion(4) -> true
     * Then 4 is the first bad version.
     *
     * Input: n = 1, bad = 1
     * Output: 1
     *
     * [boundary condition]
     * 1 <= bad <= n <= 2^31 - 1
     *
     * [link]
     * https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=level-1
     *
     * */
    public boolean isBadVersion(int n){
        boolean result = false;

        if(n >=1702766719){
            result = true;
        }

        return result;
    }

    // 1 2 3 4 5 6 [7] 8 9 10
    // 1 2 3 4 (5) 6 [7] 8 9 10
    // 6 [7] (8) 9 10
    // 6 [7]
    // [7]

    public int firstBadVersion(int n) {
       // 못풀음 -> 큰 수를 나누는 행위에서 엄청난 시간소요가 발생함 > 수를 작게 만들고 나누는게 이득
        int sdx = 0;
        int edx = n;
        while(sdx < edx){
            int mdx = sdx + (edx - sdx) / 2;

            if(isBadVersion(mdx)){
                edx = mdx;
            }else{
                sdx = mdx + 1;
            }
        }
        return sdx;
    }
}
