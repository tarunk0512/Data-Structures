package Patterns.LinkedList;

public class Node<T> {
    T val;
    Node next;
    Node(T val){
        this.val = val;
        this.next = null;
    }
}
