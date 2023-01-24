package leetcode.dayone.problem.search;

import leetcode.dayone.datatype.TreeNode;


public class ValidateBinarySearchTree {
    /*
     * [problem]
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     * A valid BST is defined as follows:
     * The left subtree  of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     *
     * [example]
     * Input: root = [2,1,3]
     * Output: true
     *
     * Input: root = [5,1,4,null,null,3,6]
     * Output: false
     * Explanation: The root node's value is 5 but its right child's value is 4.
     *
     * [boundary condition]
     * The number of nodes in the tree is in the range [1, 10^4].
     * -2^31 <= Node.val <= 2^31 - 1
     *
     * [link]
     * https://leetcode.com/problems/validate-binary-search-tree/?envType=study-plan&id=level-1
     *
     * */

    boolean result = true;

    public boolean isValidBST(TreeNode root) {
        recurBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        return result;
    }

    public void recurBST(TreeNode node, long min, long max){
        if(node == null){
            return;
        }

        long key = node.val;
        TreeNode left = node.left;
        TreeNode right = node.right;

        if(left != null){
            if(left.val < key && left.val > min){
                recurBST(left, min, key);
            }else{
                result = false;
                return;
            }
        }

        if(right != null){
            if(right.val > key && right.val < max){
                recurBST(right, key, max);
            }else{
                result = false;
                return;
            }
        }
    }
}




















