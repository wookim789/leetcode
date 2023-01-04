package leetcode75.dayone.problem;


public class IsSubsequence {
    /*
    Given two strings s and t, return true if¡ s is a subsequence of t, or false otherwise.

    A subsequence of a string is a new string that is formed from the original string
    by deleting some (can be none) of the characters without disturbing the relative positions
    of the remaining characters.
    (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    https://leetcode.com/problems/is-subsequence/submissions/871226702/?envType=study-plan&id=level-1
    */
    public static boolean isSubsequence(String s, String t){

        StringBuilder result = new StringBuilder();

        int sameIdx = 0;
        for(int sIdx = 0; sIdx < s.length(); sIdx++){
            for(int tIdx = sameIdx; tIdx < t.length(); tIdx++){
                if(s.charAt(sIdx) == t.charAt(tIdx)){
                    result.append(t.charAt(tIdx));
                    sameIdx = tIdx + 1;
                    break;
                }
            }
            if(sIdx >= result.length()){
                return false;
            }
        }

        return s.equals(result.toString());
    }
}
