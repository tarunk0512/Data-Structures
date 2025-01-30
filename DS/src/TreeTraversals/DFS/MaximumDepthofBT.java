package TreeTraversals.DFS;

import TreeTraversals.TreeNode;

public class MaximumDepthofBT {
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(11);

        MaximumDepthofBT tree = new MaximumDepthofBT();
        System.out.println(tree.maxDepth(root));

    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        if(left == 0 || right ==0) {
            return (left + right) + 1;
        }
        return Math.max(left,right)+1;
    }
}
