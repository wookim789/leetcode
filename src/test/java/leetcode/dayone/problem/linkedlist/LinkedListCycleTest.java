package leetcode.dayone.problem.linkedlist;


import leetcode.dayone.datatype.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LinkedListCycleTest {

    LinkedListCycle linkedListCycle;

    @BeforeEach
    void initialize(){
        linkedListCycle = new LinkedListCycle();
    }

    @Test
    void getCylclePointFromLinkedList(){
        ListNode given = ListNode.createNode(1, 3);
        ListNode lastNode = given;

        while(lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = given;

        ListNode actual = linkedListCycle.getCylclePointFromLinkedList(given);

        assertThat(actual.val).isEqualTo(given.val);
    }
}