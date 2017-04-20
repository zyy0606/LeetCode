/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode node=head;
        head=head.next;
        ListNode pre=node;
        while(node!=null&&node.next!=null){
            pre.next=node.next;
            pre=node;
            ListNode tmp=node.next;
            node.next=node.next.next;
            tmp.next=node;
            node=node.next;
        }
        return head;
    }
}