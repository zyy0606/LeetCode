/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode fast=head;
        ListNode pre=null;
        ListNode nxt=head.next;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            head.next=pre;
            pre=head;
            head=nxt;
            nxt=nxt.next;
        }
        if(fast.next==null) head=pre;
        else head.next=pre;
        fast=nxt;
        while(fast!=null){
            if(head.val!=fast.val) return false;
            head=head.next;
            fast=fast.next;
        }
        return true;
    }
}