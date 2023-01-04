import leetcode75.dayone.problem.SplitLinkedListParts;
import leetcode75.dayone.datatype.ListNode;

public class Main {
    public static void main(String []args){
        /* 1. running sum
        Input: nums = [3,1,2,10,1]
        Output: [3,4,6,16,17]
        int[]nums = {3,1,2,10,1};
        RunningSumOfOneDimensionArray.getRunningSum(nums);*/

        /* 2. find pivot index
        Input: nums = [1,7,3,6,5,6]
        output: 3
        int[] nums = {1,7,3,6,5,6};
        int output = FindPivotIndex.pivotIndex(nums);
        * */

        ListNode listNode =  new ListNode(1);
        ListNode preNode = listNode;
        for(int i = 2; i < 11; i++){
            listNode.next = new ListNode(i);
            listNode = listNode.next;
        }

        SplitLinkedListParts.splitListToParts(preNode, 3);
    }
}
