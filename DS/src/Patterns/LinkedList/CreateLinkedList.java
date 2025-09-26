package Patterns.LinkedList;

import java.util.List;

public class CreateLinkedList {
    public void printLinkedList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
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

    public Node createCycleLinkedList(List<Integer> ar, int pos){
        if(ar.isEmpty()) return null;
        Node head = new Node(ar.get(0));
        Node curr = head;
        Node cycleNode = null;

        for(int i = 1; i < ar.size(); i++){
            Node temp = new Node(ar.get(i));
            curr.next = temp;
            curr = temp;
            if(i == pos && cycleNode == null){
                cycleNode = temp;
            }

            if (curr.next == null && i == ar.size() - 1) {
                curr.next = cycleNode;
            }
            }


        return head;
    }
}
