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
    public ListNode reverseList(ListNode head) {
    List<Integer>wow=new ArrayList<>();
    while(head!=null)
    {
        wow.add(head.val);
        head=head.next;
    }
    Collections.reverse(wow);
    ListNode ans=new ListNode(0);
    ListNode asd=ans;
    for(int d:wow)
    {
        asd.next=new ListNode(d);
        asd=asd.next;
    }
    return ans.next;
    }
} 
