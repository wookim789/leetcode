package leetcode.dayone.datatype;

import java.util.Random;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createNode(int firstNum, int lastNum) {
        ListNode listNode = new ListNode(firstNum);
        ListNode nextNode = listNode;

        for (int i = firstNum + 1; i < lastNum + 1; i++) {
            nextNode.next = new ListNode(i);
            nextNode = nextNode.next;
        }
        return listNode;
    }

    public static ListNode createDuplicatedNode(int firstNum, int lastNum) {
        ListNode listNode = new ListNode();
        ListNode currentNode = listNode;
        for (int i = firstNum; i < lastNum + 1; i++) {
            for(int j = 0; j < 2; j++){
                currentNode.val = i;

                if(!(i == lastNum && j == 1)){
                    currentNode.next = new ListNode();
                    currentNode = currentNode.next;
                }

            }
        }
        return listNode;
    }

    public static ListNode createRandomDuplicatedNode(int firstNum, int lastNum) {
        ListNode listNode = new ListNode(firstNum);
        ListNode nextNode = listNode;

        Random random = new Random();

        for (int i = firstNum + 1; i < lastNum + 1; i++) {
            for(int j = 0; j < random.nextInt(3); j++){
                nextNode.next = new ListNode(i);
                nextNode = nextNode.next;
            }
        }
        return listNode;
    }
}
