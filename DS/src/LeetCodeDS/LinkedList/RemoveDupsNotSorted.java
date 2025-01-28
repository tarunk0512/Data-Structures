package LeetCodeDS.LinkedList;

import java.util.HashMap;

public class RemoveDupsNotSorted {
    public static void main(String [] args){
        ListNode head = new ListNode();
        ListNode curr = head;
        int [] ar = {1,2,3,4,5,6,3};
        for(int i =0; i< ar.length; i++){
            curr.next = new ListNode(ar[i]);
            curr = curr.next;
        }
        ListNode res = removeDups(head.next);
        printList(res);
    }
    public static ListNode removeDups(ListNode head){
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        ListNode curr1 = head;
        ListNode prev = curr1;
        while(curr != null){
            map.put(curr.val, map.getOrDefault(curr.val, 0)+1);
            curr = curr.next;
        }
        while(curr1 != null){
            if(map.get(curr1.val) > 1){
                prev.next = curr1.next;
            }else{
                prev = curr1;
                System.out.print(prev.val);
            }
            curr1 = curr1.next;
        }
        System.out.println(map);
        return head;
    }


    public static void printList(ListNode head){
        if(head == null) {
            System.out.println("null");
        }
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
    }
}
