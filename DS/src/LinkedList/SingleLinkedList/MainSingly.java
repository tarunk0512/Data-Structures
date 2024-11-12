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
        data.forEach(n -> singlyLinkedList.insertAtEnd(n));
        singlyLinkedList.printList();
        singlyLinkedList.insertAtIndex(2,33);
        singlyLinkedList.printList();
        singlyLinkedList.deleteFromTheStart();;
        singlyLinkedList.printList();

    }
}
