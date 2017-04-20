/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre=null;
        ListNode nxt=null;
        while(head.next!=null){
        	nxt=head.next;
            head.next=pre;
            pre=head;
            head = nxt;
        }
        head.next=pre;
        return head;
    }
}