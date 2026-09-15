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
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode l2 = slow.next;
        slow.next=null;
        ListNode l1 = head;
        ListNode prev=null;

        while(l2!=null)
        {
            ListNode temp=l2.next;
            l2.next=prev;
            prev=l2;
            l2=temp;
            
        } 
        while(prev!=null && l1!=null)
        {
            ListNode temp2 = prev.next;
            ListNode temp = l1.next;
            l1.next=prev;
            prev.next=temp;
            l1=temp;
            prev=temp2;
        }
    }
}
