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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> wow=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            wow.add(temp.val);
            temp=temp.next;
        }
        wow.remove(wow.size()-n);
        ListNode ans=new ListNode(0);
        ListNode tempi=ans;
        for(int g:wow)
        {
            tempi.next=new ListNode(g);
            tempi=tempi.next;
        }
        return ans.next;
    }
}