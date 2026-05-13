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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length < 1)    return null; 
        int jump = 1;
        while(jump < lists.length){
            for(int i = 0; i + jump < lists.length; i += jump * 2){
                ListNode a = lists[i];
                ListNode b = lists[i + jump];
                lists[i] = mergeLists(a, b);   
            }
            jump *= 2;
        }
        return lists[0];
    }

    public ListNode mergeLists(ListNode a, ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(a!= null || b != null){
            if((a != null && b!= null && a.val > b.val) || (a == null && b != null)){
                curr.next = b;
                b = b.next;
            } else{
                curr.next = a;
                a = a.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
