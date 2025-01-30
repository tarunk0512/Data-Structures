package TreeTraversals.DFS;

import TreeTraversals.TreeNode;

public class MinimumDepthOfTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        MinimumDepthOfTree tree = new MinimumDepthOfTree();
        System.out.println(tree.minDepth(root));
    }
    public int minDepth(TreeNode root){
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left==0 || right ==0) {
            return left+right+1;
        }
        return Math.min(left,right)+1;
    }

}
