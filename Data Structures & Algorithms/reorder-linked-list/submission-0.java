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
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next; 
            count++;
        }

        int[] arr = new int[count];
        temp = head;
        count = 0;
        while(temp != null){
            arr[count++] = temp.val;
            temp = temp.next;
        }
        temp = head;
        int l = count -1;
        for(int i = 0; i < ((count%2 == 0) ? (count-1)/2 : count/2); i++){
            ListNode t = temp.next;
            temp.next = new ListNode(arr[l--]);
            temp.next.next = t; 
            temp = t;
        }
        if(count%2 == 0){
            temp.next.next = null;
        } else{
            temp.next = null;
        }
    }
}
