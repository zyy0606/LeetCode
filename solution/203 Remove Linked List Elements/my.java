/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        while(head!=null&&head.val==val) head=head.next;
        ListNode pre=head;
        if(head==null) return head;
        ListNode node=head.next;
        if(node==null) return head;
        while(node.next!=null){
            if(node.val==val){
                pre.next=node.next;
                node=node.next;
            }
            else{
                pre=node;
                node=node.next;
            }
        }
        if(node.val==val) pre.next=null;
        return head;
    }
}