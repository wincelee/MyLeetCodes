package leet_code_learning;

public class SinglyLinkedList {

    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // 10 points to 8 and 8 points to 1 and 1 points to 11
        // Node 11 being the last node will point to null
        // 10 ---> 8 ---> 1 ---> 11 ---> null
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        head.next = second; // 10 ---> 8
        second.next = third; // 10 ---> 8 ---> 1
        third.next = fourth; // 10 ---> 8 ---> 1 ---> 11 ---> null

    }
}
