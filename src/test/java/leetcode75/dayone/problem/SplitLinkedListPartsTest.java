package leetcode75.dayone.problem;

import leetcode75.dayone.datatype.ListNode;
import leetcode75.dayone.problem.SplitLinkedListParts;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SplitLinkedListPartsTest {

    private ListNode createNode(int firstNum, int lastNum) {
        ListNode listNode = new ListNode(firstNum);
        ListNode nextNode = listNode;

        for (int i = firstNum + 1; i < lastNum + 1; i++) {
            nextNode.next = new ListNode(i);
            nextNode = nextNode.next;
        }
        return listNode;
    }

    @Test
    void splitListToPartsTest() {
        // given
        ListNode testNode = createNode(1, 10);
        int k = 3;

        // when
        ListNode[] actuals = SplitLinkedListParts.splitListToParts(testNode, k);

        // then
        ListNode[] expecteds = new ListNode[]{createNode(1, 4), createNode(5, 7), createNode(8, 10)};
        assertThat(actuals).usingRecursiveComparison().isEqualTo(expecteds);
    }
}