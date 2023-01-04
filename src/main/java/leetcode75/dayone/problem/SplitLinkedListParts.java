package leetcode75.dayone.problem;


import leetcode75.dayone.datatype.ListNode;

public class SplitLinkedListParts {
    /*
    Given the head of a singly linked list and an integer k,
    split the linked list into k consecutive linked list parts.

    The length of each part should be as equal as possible:
    no two parts should have a size differing by more than one.
    This may lead to some parts being null.

    The parts should be in the order of occurrence in the input list,
    and parts occurring earlier should always have a size greater than or equal to parts occurring later.

    Return an array of the k parts.

    https://leetcode.com/problems/split-linked-list-in-parts/?envType=study-plan&id=level-1
    */

    public static ListNode[] splitListToParts(ListNode head, int k) {
        // head = [1,2,3,4,5,6,7,8,9,10], k = 3

        ListNode[] result = new ListNode[k];

        if(head == null){
            return result;
        }

        int nodeSize = 1;
        ListNode sizeCheckNode = head;
        while(sizeCheckNode.next != null){
            nodeSize++;
            sizeCheckNode = sizeCheckNode.next;
        }

        int nodeGroupSize = nodeSize / k;
        int remainder = nodeSize % k;

        for(int groupIndex = 0; groupIndex < k; groupIndex++){

            int nodeGroupSizeLimit = nodeGroupSize;

            if(remainder > 0){
                nodeGroupSizeLimit ++;
                remainder --;
            }

            ListNode resultNode = null;

            for(int nodeIndex = 0; nodeIndex < nodeGroupSizeLimit; nodeIndex++){

                if(nodeIndex == 0){
                    result[groupIndex] = new ListNode(head.val);
                    resultNode = result[groupIndex];
                }

                head = head.next;
                if(head == null || nodeIndex == nodeGroupSizeLimit - 1){
                    break;
                }

                resultNode.next = new ListNode(head.val);
                resultNode = resultNode.next;
            }
        }
        return result;
    }
}

