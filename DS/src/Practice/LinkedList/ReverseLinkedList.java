package Practice.LinkedList;


import java.util.List;

public class ReverseLinkedList {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        CreateLinkedList cr = new CreateLinkedList();
        Node head = cr.createLinkedList(list);
        cr.printLinkedList(head);
        System.out.println();
        Node newHead = getReversedLinkedList(head);
        cr.printLinkedList(newHead);

        Node reverseAtIndex = getReveredAtIndex(newHead, 4);
        System.out.println();
        cr.printLinkedList(reverseAtIndex);
    }
    // 1->2->3->4
    // 1->2->3->4
    // Revese Linked List

    public static Node getReversedLinkedList(Node head){
        Node prev = head;
        Node curr = head.next;

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
    // Reverse a linkedList

    public static Node getReversedLinkedList2(Node head){
        Node prev = head;
        Node curr = prev.next;

        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head.next  = null;
        head = prev;

        return head;
    }


    public static Node getReveredAtIndex(Node head, int index){
        Node dummy = new Node<>(null);
        dummy.next = head;
        Node beforeStart = dummy;

        for(int i = 0; i<index; i++){
            beforeStart = beforeStart.next;
        }

        Node sublistHead = beforeStart.next; // node at index
        Node prev = null;
        Node curr = sublistHead;

        // Reverse the rest of the list
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Reconnect
        beforeStart.next = prev;   // connect node at index to reversed tail
        sublistHead.next = null;   // old head of sublist becomes new tail

        return dummy.next;
    }

}
