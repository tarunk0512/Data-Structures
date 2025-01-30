package TreeTraversals.DFS;

import TreeTraversals.TreeNode;
//Given the root of a binary tree, invert the tree,
// and return its root.
//                  4               4
//                 / \             / \
//                2   5  ----->   5   2
//               / \             /   / \
//              1   3               3   1
//The traversal method used in the code is akin to a postorder traversal,
// but its specific purpose is to invert the binary tree by
// swapping the left and right children of each node.
public class InvertBinaryTree {
    public static void main(String [] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        InvertBinaryTree tree = new InvertBinaryTree();
        System.out.println(tree.invertTree(root));
        //The recursive calls follow the pattern of traversing
        // the left subtree first, then the right subtree, and
        // finally processing the current node by swapping
        // its children.
        //
        //This resembles a postorder traversal ("left-right-root")
        // because the current node is processed after
        // its left and right subtrees.

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
