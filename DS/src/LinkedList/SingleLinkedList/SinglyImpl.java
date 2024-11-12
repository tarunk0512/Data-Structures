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
    public void deleteFromTheStart(){
        if(Objects.isNull(head)) throw new RuntimeException("Underflow condition");
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }
    public void deleteFromTheEnd(){
        if(Objects.isNull(head)) throw new RuntimeException("UnderFlow Condition");
        var temp = head;
        while(Objects.nonNull(temp.next.next)){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteFromTheIndex(int position){
        if(position < 0 || position>getSize() || Objects.isNull(head)){
            throw new RuntimeException("Under flow condition, please check the values");
        }
        int i = 0;
        var temp = head;
        Node prev = null;
        while(i != position){
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = temp.next;
        temp.next = null;

    }

    public void reverseTheList(){
        if(Objects.isNull(head)|| Objects.isNull(head.next)){
            return ;
        }
        var prev = head;
        var currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prev;

            prev = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prev;
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