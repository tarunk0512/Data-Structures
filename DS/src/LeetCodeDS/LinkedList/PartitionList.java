package LeetCodeDS.LinkedList;

public class PartitionList {
    public static void main(String [] args){
        ListNode head = new ListNode();
        ListNode curr = head;
        int [] ar = {1,4,3,2,5,2};
        for(int i =0; i<ar.length; i++){
            curr.next = new ListNode(ar[i]);
            curr = curr.next;
        }

        printList(head.next);
        ListNode res = partitionTheList(head.next, 3);
        System.out.println();
        printList(res);
    }

    public static ListNode partitionTheList(ListNode head, int x){
        ListNode small = new ListNode();
        ListNode greater = new ListNode();
        ListNode currSmall = small;
        ListNode currGreat = greater;
        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                currSmall.next = new ListNode(curr.val);
                currSmall = currSmall.next;
            } else if(curr.val >= x){
                currGreat.next = new ListNode(curr.val);
                currGreat = currGreat.next;
            }
            curr = curr.next;
        }
        currSmall.next = greater.next;

        return small.next;
    }



    public static void printList(ListNode head){
        ListNode curr = head ;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
