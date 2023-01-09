package leetcode.dayone.problem;


import leetcode.dayone.datatype.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MiddleOfTheLinkedListTest {

    private MiddleOfTheLinkedList middleOfTheLinkedList;

    @BeforeEach
    public void initialize(){
        middleOfTheLinkedList = new MiddleOfTheLinkedList();
    }

    @Test
    void oddSizeListTest(){
        ListNode head = ListNode.createNode(1, 5);

        ListNode actual = middleOfTheLinkedList.solution(head);

        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));

        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void evenSizeListTest(){
        ListNode head = ListNode.createNode(1, 4);

        ListNode actual = middleOfTheLinkedList.solution(head);

        ListNode expected = new ListNode(3, new ListNode(4));

        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void twoSizeListTest(){
        ListNode head = ListNode.createNode(1, 2);

        ListNode actual = middleOfTheLinkedList.solution(head);

        ListNode expected = new ListNode(2);

        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }


    @Test
    void minSizeListTest(){
        ListNode head = new ListNode(1);

        ListNode actual = middleOfTheLinkedList.solution(head);

        ListNode expected = new ListNode(1);

        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }
}