package leetcode.dayone.problem.search;

public class BinarySearch {
    /*
     * [problem]
     * Given an array of integers nums which is sorted in ascending order,
     * and an integer target, write a function to search target in nums.
     * If target exists, then return its index. Otherwise, return -1.
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * [example]
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     *
     * [boundary condition]
     * 1 <= nums.length <= 104
     * -104 < nums[i], target < 104
     * All the integers in nums are unique.
     * nums is sorted in ascending order.
     *
     * [link]
     * https://leetcode.com/problems/binary-search/?envType=study-plan&id=level-1
     *
     * */

    public int binarySearch(int[] nums, int target) {


        int sdx = 0;
        int edx = nums.length - 1;
        int result = -1;
        while(sdx <= edx){
            int mdx = (edx + sdx) / 2;

            if(nums[mdx] == target){
                result = mdx;
                break;
            }else if(nums[mdx] > target){
                edx = mdx - 1;
            }else{
                sdx = mdx + 1;
            }
        }
        return result;
    }
}
