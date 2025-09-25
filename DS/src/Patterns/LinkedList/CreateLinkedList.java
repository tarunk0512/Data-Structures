package Patterns.LinkedList;

import java.util.List;

public class CreateLinkedList {
    public  Node createLinkedList(List<Integer> ar){
        if(ar.isEmpty()) return null;
        Node head = new Node(ar.get(0));
        Node curr = head;
        for(int i = 1; i < ar.size(); i++){
            Node temp = new Node(ar.get(i));
            curr.next = temp;
            curr = temp;
        }
        return head;
    }
}
