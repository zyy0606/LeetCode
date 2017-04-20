/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode tmp=head;
        while(tmp!=null){
            len++;
            tmp=tmp.next;
        }
        if(len==1) return null;
        if(len==n) return head.next;
        tmp=head;
        int i=1;
        while(i++<len-n) tmp=tmp.next;
        tmp.next=tmp.next.next;
        return head;
    }
}