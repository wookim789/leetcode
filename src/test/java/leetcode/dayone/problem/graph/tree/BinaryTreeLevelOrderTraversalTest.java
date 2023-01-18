package leetcode.dayone.problem.graph.tree;

import leetcode.dayone.datatype.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class BinaryTreeLevelOrderTraversalTest {
    @Test
    void levelOrderTest(){
        TreeNode given = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> element1 = new ArrayList<>();
        element1.add(3);

        List<Integer> element2 = new ArrayList<>();
        element2.add(9);
        element2.add(20);

        List<Integer> element3 = new ArrayList<>();
        element3.add(15);
        element3.add(7);

        expected.add(element1);
        expected.add(element2);
        expected.add(element3);

        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> actual = binaryTreeLevelOrderTraversal.levelOrder(given);

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

}