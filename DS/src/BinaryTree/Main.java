package BinaryTree;

import java.util.Objects;

public class Main {
    public static void main(String args[]){
        BinarySearchTree tree = new BinarySearchTree();
        var root = tree.insert(null, 10);
        tree.insert(root, 20);
        tree.insert(root, 50);
        tree.insert(root, 5);
        tree.insert(root, 1);
        tree.insert(root, 7);
        tree.printLeaves(root);

        int target = 5;

        var found = tree.search(root, target);
        System.out.println();
        System.out.println(Objects.isNull(found) ? target + " NOT FOUND !!!" : target + " FOUND !!!");


    }
}
