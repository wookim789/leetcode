package leetcode.dayone.problem;

import leetcode.dayone.datatype.Node;

import java.util.ArrayList;
import java.util.List;

public class NArrayTreePreorderTraversal {
    /*
     * [problem]
     * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
     * Nary-Tree input serialization is represented in their level order traversal.
     * Each group of children is separated by the null value (See examples)
     *
     * [example]
     * Input: root = [1,null,3,2,4,null,5,6]
     * Output: [1,3,5,6,2,4]
     *
     * Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
     * Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
     *
     * [boundary condition]
     * The number of nodes in the tree is in the range [0, 104].
     * 0 <= Node.val <= 104
     * The height of the n-ary tree is less than or equal to 1000.
     *
     * [link]
     * https://leetcode.com/problems/n-ary-tree-preorder-traversal/?envType=study-plan&id=level-1
     *
     * */
    List<Integer> result;
    public List<Integer> getPreorderList(Node root){

        this.result = new ArrayList<>();
        if(root == null){
            return this.result;
        }
        this.result.add(root.val);

        this.recursiveFindChildren(root.children);

        return this.result;
    }

    public void recursiveFindChildren(List<Node> children){
        if(children == null){
            return;
        }

        for(Node child: children){
            if(child != null){
                this.result.add(child.val);
                this.recursiveFindChildren(child.children);
            }
        }
    }
}
