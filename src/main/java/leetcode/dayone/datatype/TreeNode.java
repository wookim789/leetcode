package leetcode.dayone.datatype;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode() {}
     public TreeNode(int val) { this.val = val; }
     public TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

     public TreeNode getTreeNode(List<Integer> list) {
        TreeNode root = new TreeNode(list.get(0));
        if(list.get(1) != null){
            root.left =  new TreeNode(list.get(1));
        }
        if(list.get(2) != null){
            root.right = new TreeNode(list.get(2));
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        int n = 2;
        int idx = 2;
        while(list.size() > idx + Math.pow(2, n)){
            TreeNode parentLeft = queue.poll();
            idx = setQueue(idx, parentLeft, list, queue);

            TreeNode parentRight = queue.poll();
            idx = setQueue(idx, parentRight, list, queue);

            n++;
        }
        return root;
     }

     private int setQueue(int idx, TreeNode parentNode, List<Integer>list, Queue<TreeNode> queue){
         if(parentNode != null){
             idx ++;
             Integer val = list.get(idx);

             TreeNode left = null;
             if(val != null){
                 left = new TreeNode(val);
             }

             idx ++;
             val = list.get(idx);
             TreeNode right = null;
             if(val != null){
                 right = new TreeNode(val);
             }
             parentNode.left = left;
             parentNode.right = right;
             queue.add(parentNode.left);
             queue.add(parentNode.right);
         }
         return idx;
     }
 }