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
    public ListNode reverseKGroup(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        ListNode curr = head;
        ListNode dummy = new ListNode(0);
        ListNode prevTail = dummy;
        for(int i = 0; i < size/k; i++){
            ListNode gpHead = curr;
            ListNode prev = null;
            for(int j = 0; j < k; j++){
                ListNode t = curr.next;
                curr.next = prev;
                prev = curr;
                curr = t;
            }
            gpHead.next = curr;
            prevTail.next = prev;
            prevTail = gpHead;
        }
        return dummy.next;
    }
}
