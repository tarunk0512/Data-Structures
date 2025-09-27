package Practice.LinkedList;

import java.util.List;

public class CreateLinkedList {
    public  Node createLinkedList(List<Integer> list){
        Node head = null;
        Node temp = new Node(list.get(0));
        head = temp;

        for(int i = 1; i<list.size(); i++){
            Node curr = new Node(list.get(i));
            temp.next = curr;
            temp = curr;

        }
        return head;
    }

    public void printLinkedList(Node head){
        Node curr = head;
        while(curr != null){
            if(curr.next == null){
                System.out.print(curr.val+ " -> null");
                break;
            }
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
    }}
