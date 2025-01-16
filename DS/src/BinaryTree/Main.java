package BinaryTree;

public class Main {
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        var root = tree.insert(null, 10);
        tree.insert(root, 20);
        tree.insert(root, 50);
        tree.insert(root, 5);
        tree.insert(root, 1);
        tree.insert(root, 7);
        System.out.println(tree);

    }
}
