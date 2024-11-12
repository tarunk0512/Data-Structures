package LinkedList.SingleLinkedList;

import java.util.Objects;

public class SinglyImpl<T> {
    private Node head;

    public void insertAtStart(T data) {
        var newNode = new Node(data);

        if (!Objects.isNull(head)) {
            newNode.next = head;
        }

        head = newNode;
    }

    public void printList() {
        var temp = head;
        while (!Objects.isNull(temp.next)) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data);
        System.out.println("\n");
    }



}