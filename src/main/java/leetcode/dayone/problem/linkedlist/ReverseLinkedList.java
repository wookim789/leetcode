package leetcode.dayone.problem.linkedlist;

import leetcode.dayone.datatype.ListNode;

import java.util.Stack;

public class ReverseLinkedList {
    /*
     * [problem]
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     *
     * [example]
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     *
     * [boundary condition]
     * The number of nodes in the list is the range [0, 5000].
     * -5000 <= Node.val <= 5000
     *
     * [link]
     * https://leetcode.com/problems/reverse-linked-list/?envType=study-plan&id=level-1
     *
     * */

    public static ListNode reverseLinkedList(ListNode head) {

        int inputHeadSize = 0;
        ListNode inputSizeCheckNode = head;

        while (inputSizeCheckNode != null) {
            inputHeadSize++;
            inputSizeCheckNode = inputSizeCheckNode.next;
        }

        if (inputHeadSize == 0) {
            return null;
        }

        Stack<ListNode> stack = new Stack();

        while(inputHeadSize > 0){
            stack.push(new ListNode(head.val, head.next));
            head = head.next;
            inputHeadSize--;
        }

        ListNode result = new ListNode(stack.pop().val, null);
        ListNode curNode = result;

        while(!stack.isEmpty()){
            ListNode node = stack.pop();
            curNode.next = new ListNode(node.val, node.next);
            curNode = curNode.next;
        }
        curNode.next = null;

        return result;
    }

    // 재귀함수 이용해서 풀어보기
}
