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
}
