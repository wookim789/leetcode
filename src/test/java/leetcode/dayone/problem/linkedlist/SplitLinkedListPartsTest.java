package leetcode.dayone.problem.linkedlist;

import leetcode.dayone.datatype.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static leetcode.dayone.datatype.ListNode.createNode;

class SplitLinkedListPartsTest {



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