package leetcode75.seventyfive.dayone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsomorphicStrings {
    /*
    Given two strings s and t, determine if they are isomorphic.
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character
    while preserving the order of characters. No two characters may map to the same character,
    but a character may map to itself.

    Example 1:
    Input: s = "egg", t = "add"
    Output: true

    Example 2:
    Input: s = "foo", t = "bar"
    Output: false

    Example 3:
    Input: s = "paper", t = "title"
    Output: true

    Constraints:
    1 <= s.length <= 5 * 104
    t.length == s.length
    s and t consist of any valid ascii character.
    */
    public static boolean isIsomorphic(String s, String t) {
        List<Character> sArrays = new ArrayList<>();
        List<Character> tArrays = new ArrayList<>();

        // 문자열 인덱스
        // 각 배열 순회 인덱스

        for (int strIdx = 0; strIdx < s.length(); strIdx++) {
            Character curS = s.charAt(strIdx);
            Character curT = t.charAt(strIdx);
            int sIdx = sArrays.indexOf(curS);
            int tIdx = tArrays.indexOf(curT);

            if (sIdx == tIdx) {
                if (sIdx == -1) {
                    sArrays.add(curS);
                    tArrays.add(curT);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
