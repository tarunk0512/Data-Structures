package BinaryTree;

import java.util.Objects;

public class BinarySearchTree {
    public Node insert(Node node, Integer data){
        Node newNode = new Node(data);
        if(Objects.isNull(node)){
            node = newNode;
        }else {
            if(data < node.data){
                node.left = insert(node.left, data);
            }else if(data > node.data){
                node.right = insert(node.right, data);
            }
        }
    return node;
    }

    public Node search(Node root, Integer target)
    {
        if(Objects.isNull(root) || Objects.equals(root.data, target)) {
            return root;
        }
        if(root.data < target) {
           return search(root.right, target);
        }
        else {
            return search(root.left, target);
        }
    }

    public void printLeaves(Node root){
        if(root.left == null && root.right == null){
            System.out.print(root.data+", ");
        }
        if(root.left != null){
            printLeaves(root.left);
        }
        if(root.right != null){
            printLeaves(root.right);
        }
    }
}
