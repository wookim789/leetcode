package leetcode.dayone.problem.search;

import leetcode.dayone.datatype.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

    @Test
    void isValidBSTTest1(){
        // [2,1,3]
        TreeNode given = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        boolean expected = true;

        boolean actual = validateBinarySearchTree.isValidBST(given);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    void isValidBSTTest2(){
        // [5,1,4,null,null,3,6]
        TreeNode given = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        boolean expected = false;

        boolean actual = validateBinarySearchTree.isValidBST(given);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isValidBSTTest3(){
        // [5,4,6,null,null,3,7]
        TreeNode given = new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        boolean expected = false;

        boolean actual = validateBinarySearchTree.isValidBST(given);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isValidBSTTest4(){
        // [120,
        // 70,140,
    // 50,100,130,160,
// 20,55, 75,110, 119,135, 150,200]

        TreeNode given =
                new TreeNode(120,
                        new TreeNode(70,
                                new TreeNode(50,
                                        new TreeNode(20), new TreeNode(55)),
                                new TreeNode(100,
                                        new TreeNode(75), new TreeNode(110))),
                        new TreeNode(140,
                                new TreeNode(130,
                                        new TreeNode(119), new TreeNode(135)),
                                new TreeNode(160,
                                        new TreeNode(150), new TreeNode(200))));
        boolean expected = false;

        boolean actual = validateBinarySearchTree.isValidBST(given);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isValidBSTTest5(){
//                                          32,
//                                        26,47,
//                                    19,null,  null,56,
//                                 null,27]
        TreeNode given = new TreeNode(32,
                new TreeNode(26,
                        new TreeNode(19,
                                null,
                                new TreeNode(27)),
                        null),
                new TreeNode(47,
                        null,
                        new TreeNode(56))
                );

        boolean expected = false;
        boolean actual = validateBinarySearchTree.isValidBST(given);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
    @Test
    void isValidBSTTest6(){
//                                                22
//                                              12  n
//                                         -88  n
//                                         n -69
        TreeNode given = new TreeNode(22,
                new TreeNode(12,
                        new TreeNode(-88,
                                null,
                                new TreeNode(-69)),
                        null),
                null
        );

        boolean expected = true;
        boolean actual = validateBinarySearchTree.isValidBST(given);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
}