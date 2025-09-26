package Patterns.LinkedList;

import java.util.List;

public class MergeSortedLinkedList {
public static void main(String [] args){
    CreateLinkedList cr = new CreateLinkedList();
    Node l1 = cr.createLinkedList(List.of(1,3,5,7));
    Node l2 = cr.createLinkedList(List.of(2,4,6,8));
    Node merged = mergeLists(l1, l2);
    cr.printLinkedList(merged);
}
    //Merge Two Sorted Arrays


    public static Node mergeLists(Node l1, Node l2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val.compareTo(l2.val) < 0){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;

        }
        // Attach the remaining nodes
        if (l1 != null) temp.next = l1;
        if (l2 != null) temp.next = l2;

        return dummy.next; // head of merged list
    }
}
