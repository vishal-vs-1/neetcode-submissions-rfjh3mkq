/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }

        int pos = size - n;
        ListNode prev = null;
        curr = head;
        ListNode next = head.next;
        while(pos != 0){
            pos--;
            prev = curr;
            next = curr.next.next;
            curr = curr.next;
        }
        if(prev != null){
            prev.next = next;
        } else{
            head = next;
        }
        curr.next = null;
        return head;

    }
}
