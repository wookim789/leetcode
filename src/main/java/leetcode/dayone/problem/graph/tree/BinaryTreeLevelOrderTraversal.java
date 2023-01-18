package leetcode.dayone.problem.graph.tree;

import leetcode.dayone.datatype.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    /*
     * [problem]
     * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
     *
     * [example]
     * Input: root = [3,9,20,null,null,15,7]
     * Output: [[3],[9,20],[15,7]]
     *
     * Input: root = [1]
     * Output: [[1]]
     *
     * Input: root = []
     * Output: []
     *
     * [boundary condition]
     * The number of nodes in the tree is in the range [0, 2000].
     * -1000 <= Node.val <= 1000
     *
     * [link]
     * https://leetcode.com/problems/binary-tree-level-order-traversal/?envType=study-plan&id=level-1
     *
     * */

    List<List<Integer>> result;

    public List<List<Integer>> levelOrder(TreeNode root) {
        // 트리의 레벨(깊이)별 2개씩 묶어서 데이터 리턴

        if (root == null) {
            return new ArrayList<>();
        }

        result = new ArrayList<>();

        List<Integer> levelList = new ArrayList<>();
        levelList.add(root.val);

        result.add(levelList);

        if(root.left == null && root.right == null){
            return result;
        }

        Queue<TreeNode> queueTreeNode = new LinkedList<>();
        if(root.left != null){
            queueTreeNode.add(root.left);
        }

        if(root.right != null){
            queueTreeNode.add(root.right);
        }

        while(!queueTreeNode.isEmpty()){
            levelList = new ArrayList<>();
            int size = queueTreeNode.size();

            for(int i = 0; i < size; i++){
                TreeNode treeNode = queueTreeNode.poll();
                levelList.add(treeNode.val);

                if(treeNode.left !=null){
                    queueTreeNode.add(treeNode.left);
                }
                if(treeNode.right != null){
                    queueTreeNode.add(treeNode.right);
                }
            }
            result.add(levelList);
        }
        return result;
    }
}