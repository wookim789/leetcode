package leetcode.dayone.problem.linkedlist;

import leetcode.dayone.datatype.ListNode;

import java.util.HashSet;
import java.util.Set;


public class LinkedListCycle {
    /*
    * [problem]
    * Given the head of a linked list, return the node where the cycle begins.
    * If there is no cycle, return null.
    * There is a cycle in a linked list if there is some node in the list
    * that can be reached again by continuously following the next pointer.
    *
    * Internally, pos is used to denote the index of the node
    * that tail's next pointer is connected to (0-indexed).
    * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
    * not modify the linked list.
    *
    * [example]
    * Input: head = [3,2,0,-4], pos = 1
    * Output: tail connects to node index 1
    * Explanation: There is a cycle in the linked list, where tail connects to the second node.
    * [boundary condition]
    *
    * [line]
    * */

    public ListNode getCylclePointFromLinkedList(ListNode head){

        Set<ListNode> setListNode = new HashSet<>();

        while(!setListNode.contains(head)){
            setListNode.add(head);
            if(head != null && head.next != null){
                head = head.next;
            }else{
                return  null;
            }
        }

        return head;
    }
}
