package Patterns.LinkedList;

import java.util.HashMap;
import java.util.List;


public class DetectCycleInLinkedList {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,5,4,6,7,4);
        CreateLinkedList cr = new CreateLinkedList();
        Node head = cr.createCycleLinkedList(list, 4);
        System.out.println(checkCycle(head));
    }

    public static HashMap<Integer, Boolean> checkCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                HashMap<Integer, Boolean> map = new HashMap<>();
                map.put((Integer)slow.val, true);
                return map;
            }
        }

        return new HashMap<>(){{put(-1, false);}};
}
}
