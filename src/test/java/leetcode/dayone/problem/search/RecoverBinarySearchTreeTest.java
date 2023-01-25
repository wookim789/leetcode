package leetcode.dayone.problem.search;

import leetcode.dayone.datatype.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RecoverBinarySearchTreeTest {
    RecoverBinarySearchTree recoverBinarySearchTree = new RecoverBinarySearchTree();

    @Test
    void recoverTreeTest1(){
        List<Integer> givenList = Stream.of(1,3,null,null,2).collect(Collectors.toList());
        TreeNode givenAndActual = new TreeNode().getTreeNode(givenList);

        recoverBinarySearchTree.recoverTree(givenAndActual);

        List<Integer> expectedList = Stream.of(3,1,null,null,2).collect(Collectors.toList());
        TreeNode expected = new TreeNode().getTreeNode(expectedList);

        Assertions.assertThat(givenAndActual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void recoverTreeTest2(){
        List<Integer> givenList = Stream.of(3,1,4,null,null,2).collect(Collectors.toList());
        TreeNode givenAndActual = new TreeNode().getTreeNode(givenList);

        recoverBinarySearchTree.recoverTree(givenAndActual);

        List<Integer> expectedList = Stream.of(2,1,4,null,null,3).collect(Collectors.toList());
        TreeNode expected = new TreeNode().getTreeNode(expectedList);

        Assertions.assertThat(givenAndActual).usingRecursiveComparison().isEqualTo(expected);
    }

}