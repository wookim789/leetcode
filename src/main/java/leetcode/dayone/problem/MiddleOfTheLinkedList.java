package leetcode.dayone.problem;

import leetcode.dayone.datatype.ListNode;

public class MiddleOfTheLinkedList {
    /*
    * [problem]
    * Given the head of a singly linked list, return the middle node of the linked list.
    * If there are two middle nodes, return the second middle node.
    *
    * [example]
    * Input: head = [1,2,3,4,5]
    * Output: [3,4,5]
    * Explanation: The middle node of the list is node 3.
    *
    * [boundary condition]
    * The number of nodes in the list is in the range [1, 100].
    * 1 <= Node.val <= 100
    * */


    private ListNode result;

    public ListNode solution(ListNode head){
        if(head.next == null){
            return head;
        }
        findMiddleOfList(head, 1);
        return result;
    }

    public int findMiddleOfList(ListNode currentNode, int currentDepth){
        int resultDepth;
        if(currentNode.next != null){
            resultDepth = findMiddleOfList(currentNode.next, currentDepth + 1);
        }else{
            resultDepth = currentDepth;
        }

        if(resultDepth / 2 + 1 == currentDepth){
            result = currentNode;
        }

        return resultDepth;
    }
}
