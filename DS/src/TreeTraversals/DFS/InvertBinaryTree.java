package TreeTraversals.DFS;

import TreeTraversals.TreeNode;
//Given the root of a binary tree, invert the tree,
// and return its root.
//                  4               4
//                 / \             / \
//                2   5  ----->   5   2
//               / \             /   / \
//              1   3               3   1
public class InvertBinaryTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        InvertBinaryTree tree = new InvertBinaryTree();
        System.out.println(tree.invertTree(root));

    }

    public TreeNode invertTree(TreeNode root){
      if(root == null){
          return null;
      }
      invertTree(root.left);
      invertTree(root.right);
      TreeNode temp = root.left;
      root.left = root.right;
      root.right = temp;
      return root;
    }
}
