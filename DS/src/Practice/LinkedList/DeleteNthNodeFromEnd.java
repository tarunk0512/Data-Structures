package Practice.LinkedList;

public class DeleteNthNodeFromEnd {
    public static void main(String [] args){
        CreateLinkedList cr = new CreateLinkedList();
        Node head = cr.createLinkedList(java.util.List.of(1,2,3,4,5,6,7));
        cr.printLinkedList(head);
        head = removeNthNode(head, 3);
        System.out.println();
        cr.printLinkedList(head);
    }
    // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7

//Remove N-th Node from End
// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
    public static Node removeNthNode(Node head, int n){
        if (head == null) return null;  // empty list case

        Node slow = head;
        Node fast = head;

        while(n>0 && fast != null){
            fast = fast.next;
            n--;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node temp = slow.next.next;
        slow.next = temp;

        return head;

    }





}





