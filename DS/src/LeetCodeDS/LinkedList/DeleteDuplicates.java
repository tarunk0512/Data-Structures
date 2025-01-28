package LeetCodeDS.LinkedList;

public class DeleteDuplicates {
    public static void main(String [] args){
        ListNode head = new ListNode();
        ListNode curr = head;
        int [] ar = {1,1,2,3,4,5,5,6};
        for(int i = 0; i< ar.length; i ++){
            curr.next = new ListNode(ar[i]);
            curr = curr.next;
        }
        deleteDuplicates(head);
        printList(head.next);
    }
    public static ListNode deleteDuplicates(ListNode head){
        ListNode res = new ListNode(0,head);
        ListNode prev = res;
        if(head == null || head.next == null){
            return head;
        }
        while(head != null && head.next != null){
            if(head.next.val == head.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else {
                prev = prev.next;
            }
            head = head.next;
        }
        return res.next;
    }


    public static void printList(ListNode head){
        ListNode curr = new ListNode();
        curr = head;
        while(curr != null){
            System.out.print(curr.val + " ->");
            curr = curr.next;
        }
    }
}
