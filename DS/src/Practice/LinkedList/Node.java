package Practice.LinkedList;

class Node<T extends Comparable<T>> {
    Node next;
    T val;
    Node(T val){
        this.val = val;
    }
}
