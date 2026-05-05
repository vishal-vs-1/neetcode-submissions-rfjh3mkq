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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse other half
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while(curr!= null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            ListNode ft = first.next;
            ListNode st = second.next;
            first.next = second;
            second.next = ft;
            first = ft;
            second = st;
        }
    }
}
