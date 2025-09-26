package Patterns.LinkedList;

class Node<T extends Comparable<T>> {
    T val;
    Node next;
    Node(T val){
        this.val = val;
        this.next = null;
    }
}
