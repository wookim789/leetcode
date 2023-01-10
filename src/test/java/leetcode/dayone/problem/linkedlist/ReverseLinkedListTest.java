package leetcode.dayone.problem.linkedlist;

import leetcode.dayone.datatype.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    public void reverseLinkedListTest(){
        ListNode inputHead = ListNode.createNode(1, 5);

        ListNode actual = ReverseLinkedList.reverseLinkedList(inputHead);

        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

}