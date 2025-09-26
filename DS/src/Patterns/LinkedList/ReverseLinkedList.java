package Patterns.LinkedList;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String [] args){
        CreateLinkedList cr = new CreateLinkedList();
        Node head = cr.createLinkedList(List.of(1,2,3,4,5));
        head = getReverseLinkedList(head);
        cr.printLinkedList(head);
    }
//Reverse Linked List :

    public static Node getReverseLinkedList(Node head){
        Node curr = head.next;
        Node prev = head;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head.next = null;
        head = prev;

    return head;
    }
}


