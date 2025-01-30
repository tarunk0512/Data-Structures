package TreeTraversals.DFS;

import TreeTraversals.TreeNode;
//Given the root of a Binary Search Tree (BST),
//    return the minimum absolute difference between the
//values of any two different nodes in the tree.


public class MinimumAbsoluteDifference {
     Integer prev = null;
     int min = Integer.MAX_VALUE;
    public static void main(String[] args){
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        MinimumAbsoluteDifference ab = new MinimumAbsoluteDifference();
        System.out.println(ab.getMinimumDifference(root));
    }

    public int getMinimumDifference(TreeNode root){
        if(root == null){
            return min;
        }
        getMinimumDifference(root.left);
        if(prev!=null){
            min = Math.min(min, root.val-prev);
        }
        prev = root.val;
        return getMinimumDifference(root.right);
    }
}
