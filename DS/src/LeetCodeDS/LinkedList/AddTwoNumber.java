package LeetCodeDS.LinkedList;


//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
public class AddTwoNumber {
    public static void main(String [] args){
    ListNode l1 = new ListNode();
    ListNode curr1 = l1;

    ListNode l2 = new ListNode();
    ListNode curr2 = l2;

    int [] ar1 = {2,4,3};
    int [] ar2 = {5,6,4};
    for(int i =0; i<3; i++){
        curr1.next = new ListNode(ar1[i]);
        curr1 = curr1.next;

        curr2.next = new ListNode(ar2[i]);
        curr2 = curr2.next;
    }
    l1 = l1.next;
    l2 = l2.next;
    printLinkedList(l1);
    printLinkedList(l2);

    ListNode res = addList(l1,l2);
    printLinkedList(res);
    }
    public static ListNode addList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            total = carry;
            if(l1 != null){
                total += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                total += l2.val;
                l2 = l2.next;
            }
            int num = total % 10;
            carry = total / 10 ;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }
        return res.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
