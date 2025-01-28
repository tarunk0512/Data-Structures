package LeetCodeDS.LinkedList;

import java.util.List;

public class RemoveDuplicates {
    public static void main(String [] args){
        ListNode l1 = new ListNode();
        ListNode curr = l1;
        int[] ar = {1,1,2};
        for(int i =0; i< ar.length; i++){
            curr.next = new ListNode(ar[i]);
            curr = curr.next;
        }
        deleteDups(l1);
        printLinkedList(l1);
    }
    public static ListNode deleteDups(ListNode l1){
        if(l1== null) return null;
        ListNode curr = l1;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }else
            {
            curr = curr.next;
            }
        }
        return l1;
    }


    public static void printLinkedList(ListNode l1){
        ListNode curr = l1;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
    }
}
