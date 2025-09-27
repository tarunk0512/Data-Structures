package Practice.LinkedList;

public class DeleteNthNodeFromEnd {
    public static void main(String [] args){
        CreateLinkedList cr = new CreateLinkedList();
        Node head = cr.createLinkedList(java.util.List.of(1,2,3,4,5,6,7));
        cr.printLinkedList(head);
        head = removeNthNode(head, 3);
        System.out.println();
        cr.printLinkedList(head);

        Node head2 = cr.createLinkedList(java.util.List.of(1,2,3,4,5,6,7));
        head2 = removeNthNodeEdgeCases(head2, 7);
        System.out.println();
        cr.printLinkedList(head2);
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
        slow.next = slow.next.next;

        return head;

    }
    // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7

//Remove N-th Node from End

    public static Node removeNthNodeEdgeCases(Node head, int n){

        Node dummy = new Node(-1);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        if(head == null) return null;

        for(int i = 0; i<=n; i++){
            if(fast == null) {
                return head;
            }
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;

    }









}





