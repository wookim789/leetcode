package leetcode.dayone.problem;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    /*
     * [problem]
     * Given a string s which consists of lowercase or uppercase letters,
     * return the length of the longest palindrome that can be built with those letters.
     * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
     *
     * [example]
     * Input: s = "abccccdd"
     * Output: 7
     * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
     *
     * [boundary condition]
     * 1 <= s.length <= 2000
     * s consists of lowercase and/or uppercase English letters only.
     *
     * [link]
     * https://leetcode.com/problems/longest-palindrome/?envType=study-plan&id=level-1
     *
     * */

    public int getLongestPalindrome(String s){
        // s 문자 > 각 문자별 개수 취합
        // 짝수개 > 결과값 + 짝수
        // 홀수개 > 가장 큰값의 홀수만 더함


        if(s.length() == 1){
            return 1;
        }

        Map<Character, Integer> stringCountMap = new HashMap<>();


        int oddCount = 0;
        for(int idx = 0; idx < s.length(); idx++){
            Character sdx = s.charAt(idx);

            if(stringCountMap.containsKey(sdx)){
                int cnt = stringCountMap.get(sdx) + 1;
                stringCountMap.put(sdx, cnt);
                if(cnt % 2 != 0){
                    oddCount ++;
                }else{
                    oddCount --;
                }
            }else{
                stringCountMap.put(sdx, 1);
                oddCount++;
            }
        }

        if(oddCount > 0){
            oddCount -= 1;
        }

        return s.length() - oddCount;
    }
}
