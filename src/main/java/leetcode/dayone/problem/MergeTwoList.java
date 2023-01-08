package leetcode.dayone.problem;

import leetcode.dayone.datatype.ListNode;

public class MergeTwoList {
    /*
    [problem]
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists in a one sorted list.
    The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.

    [example]
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]

    [boundary condition]
    The number of nodes in both lists is in the range [0, 50].
    -100 <= Node.val <= 100
    Both list1 and list2 are sorted in non-decreasing order.

    [link]
    https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=level-1
    */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // list1 list2의 현재 값중 더 작은 값을 응답 객체에 저장한다.
        // list1, list2 길이 측정
        // 위 두 리스트이 길이 많큼 반복

        int listTotalSize = 0;

        ListNode sizeCheckNode = list1;
        while(sizeCheckNode != null){
            listTotalSize ++;
            sizeCheckNode = sizeCheckNode.next;
        }

        sizeCheckNode = list2;
        while(sizeCheckNode != null){
            listTotalSize ++;
            sizeCheckNode = sizeCheckNode.next;
        }

        if(listTotalSize == 0){
            return null;
        }

        ListNode resultNode = new ListNode();
        ListNode resultCurrentNode = resultNode;
        for(int i = 0; i < listTotalSize; i++){
            if(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    resultCurrentNode.val = list1.val;
                    list1 = list1.next;
                }else{
                    resultCurrentNode.val = list2.val;
                    list2 = list2.next;
                }
            }else if (list1 == null && list2 != null){
                resultCurrentNode.val = list2.val;
                list2 = list2.next;
            }else if(list1 != null && list2 == null){
                resultCurrentNode.val = list1.val;
                list1 = list1.next;
            }else{
                break;
            }
            if(i != listTotalSize -1){
                resultCurrentNode.next = new ListNode();
            }
            resultCurrentNode = resultCurrentNode.next;
        }

        return resultNode;
    }
}
