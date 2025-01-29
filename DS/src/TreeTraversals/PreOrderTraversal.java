package TreeTraversals;
//     4
//    /  \
//   2    5
//  / \
// 1   3
public class PreOrderTraversal {
    public static void main(String [] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        preOrder(root);
    }

    public static void preOrder(TreeNode root){
        if(root != null)
        {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
