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
//1 - 2 - 3 - 4 - 5
        ListNode curr = prev.next;
        for(int i =0; i<right-left; i++){
            ListNode temp = curr.next; //temp -> 3 curr -> 2
            //curr = 2, temp = 2.next == 4 -> temp =4
            curr.next = temp.next; //curr =2 = 2->4
            //2->5(temp/4.next)
            temp.next = prev.next;//temp = 3 = 3->2
            //4->3 => temp.next->3(prev.next)
            prev.next = temp;//1->3
            // 1(prev).next->4(temp)
        }
        //After 1st iteration 1->3->2->4->5
        //After 2nd iteration 1->4->3->2->5
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
