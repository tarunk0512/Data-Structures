package LinkedList.SingleLinkedList;

import java.util.Objects;

public class SinglyImpl<T> {
    private Node head;

    public void insertAtStart(T data) {
        var newNode = new Node(data);
        var temp = head;
        if (!Objects.isNull(head)) {
            newNode.next = temp;
        }

        head = newNode;
    }
    public void insertAtEnd(T data){
        var newNode = new Node(data);
        if(Objects.isNull(head)){
            head = newNode;
        }else{
            var temp = head;
            while(!Objects.isNull(temp.next)){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public void printList() {
        var temp = head;
        while (!Objects.isNull(temp.next)) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data);
        System.out.println("\n");
    }
    public void insertAtIndex(int position, T data){
        if(position < 0 || position > getSize()){
            throw new IndexOutOfBoundsException("Position invalid");
        }
        int i = 0;
        Node temp = head;
        Node newNode = new Node(data);
        while(i != position-1){
            temp =temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
    }

    public int getSize(){
        int count = 0;
        Node temp = head;
        while(Objects.nonNull(temp.next)){
            temp = temp.next;
            count ++;
        }
        return count;
    }



}