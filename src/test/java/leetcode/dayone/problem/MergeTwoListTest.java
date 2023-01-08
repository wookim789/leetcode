package leetcode.dayone.problem;

import leetcode.dayone.datatype.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static leetcode.dayone.datatype.ListNode.createDuplicatedNode;

public class MergeTwoListTest {

    @Test
    public void mergeTwoList(){
        ListNode list1 = createDuplicatedNode(1,3);
        ListNode list2 = createDuplicatedNode(1,2);

        ListNode actual = MergeTwoList.mergeTwoLists(list1,list2);
        ListNode expected = new ListNode(1,
                                    new ListNode(1,
                                        new ListNode(1,
                                            new ListNode(1,
                                                new ListNode(2,
                                                    new ListNode(2,
                                                        new ListNode(2,
                                                            new ListNode(2,
                                                                new ListNode(3,
                                                                    new ListNode(3))))))))));
        assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }
}
