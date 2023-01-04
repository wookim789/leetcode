package leetcode75.dayone.problem;

public class RunningSumOfOneDimensionArray {
    /*
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Return the running sum of nums.

    Example1:
        Input: nums = [1,2,3,4]
        Output: [1,3,6,10]
        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

    Example2:
        Input: nums = [1,1,1,1,1]
        Output: [1,2,3,4,5]
        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

    Example3:
        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]

    */

    public static int[] getRunningSum(int[] nums){

        int[] runningSum = new int[nums.length];

        // 첫 인수는 동일하게 저장한다.
        runningSum[0] = nums[0];

        // runningSum[n] = runningSum[n-1] + nums[n]
        for(int i = 1; i < nums.length; i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }

        return runningSum;
    }
}

