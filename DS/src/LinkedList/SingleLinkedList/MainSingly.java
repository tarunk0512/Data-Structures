package LinkedList.SingleLinkedList;

import java.util.List;
import java.util.stream.IntStream;

public class MainSingly {
    public static void main(String [] args){
        List<Integer> data = IntStream.rangeClosed(1, 10).boxed().toList();

        System.out.println("Inserting elements at the beginning");
        SinglyImpl<Integer> singlyLinkedList = new SinglyImpl<>();
        //data.stream().forEach(n -> singlyLinkedList.insertAtStart(n));
        //singlyLinkedList.printList();

        // Inserting at the END
        System.out.println("Inserting in the END");
        data.forEach(n -> singlyLinkedList.insertAtEnd(n));
        singlyLinkedList.printList();
        System.out.println("Inserting at a given index");
        singlyLinkedList.insertAtIndex(2,33);
        singlyLinkedList.printList();
        System.out.println("Deleting from the start");
        singlyLinkedList.deleteFromTheStart();
        singlyLinkedList.printList();
        System.out.println("Deleting from the End");
        singlyLinkedList.deleteFromTheEnd();
        singlyLinkedList.printList();
        System.out.println("Deleting from a given index");
        singlyLinkedList.deleteFromTheIndex(3);
        singlyLinkedList.printList();


    }
}
