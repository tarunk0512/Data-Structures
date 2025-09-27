package Practice.LinkedList;


import java.util.List;

public class ReverseLinkedList {
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        CreateLinkedList cr = new CreateLinkedList();
        Node head = cr.createLinkedList(list);
        cr.printLinkedList(head);

    }
}
