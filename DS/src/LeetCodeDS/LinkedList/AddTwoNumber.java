package LeetCodeDS.LinkedList;


public class AddTwoNumber {
    public static void main(String [] args){
    ListNode l1 = new ListNode();
    ListNode curr;
    curr = l1;
    for(int i =0; i<3; i++){
        curr.next = new ListNode(i+1);
        curr = curr.next;
    }
    l1 = l1.next;
    printLinkedList(l1);
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
