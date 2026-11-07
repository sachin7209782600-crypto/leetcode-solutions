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
    public ListNode removeElements(ListNode head, int val) {
        ListNode a=new ListNode(0);
        ListNode ans=a;
        while(head!=null)
        {
            if(head.val!=val)
            {
                ans.next=new ListNode(head.val);
                ans=ans.next;
            }
            head=head.next;
        }
        return a.next;
    }
}