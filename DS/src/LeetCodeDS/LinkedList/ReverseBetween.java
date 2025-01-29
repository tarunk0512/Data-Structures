package LeetCodeDS.LinkedList;

public class ReverseBetween {
    public static void main(String [] args){
        int [] ar = {1,2,3,4,5};
        int right = 4;
        int left =2;
        ListNode head = new ListNode();
        ListNode curr = head;
        for(int i = 0; i<ar.length; i++){
            curr.next = new ListNode(ar[i]);
            curr = curr.next;
        }

        printList(head);
        ListNode res = reverseBetween(head.next, left, right);
        System.out.println();
        printList(res);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right){
        if(head == null || left == right){
            return head;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        for(int i =0 ; i< left-1; i++){
            prev = prev.next;
        }

        ListNode curr = prev.next;
        for(int i =0; i<right-left; i++){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = prev.next;
            prev.next = temp;
        }
        return dummy.next;
    }


    public static void printList(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
