package TreeTraversals;

public class InOrderTraversal {
    public static void main(String [] args){
        TreeNode root = new TreeNode(4);
        root.left =new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);
        inOrderTraversal(root);
    }
//     4
//    /  \
//   2    5
//  / \
// 1   3
    public static void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
}
