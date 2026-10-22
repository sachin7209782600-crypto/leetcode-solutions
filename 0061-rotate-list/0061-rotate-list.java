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
    public ListNode rotateRight(ListNode head, int k) {
       List<Integer>wow=new ArrayList<>();
       if(head==null||head.next==null) return head;
       ListNode temp=head;
       while(temp!=null)
       {
        wow.add(temp.val);
        temp=temp.next;
       }
       int rot=k%wow.size();
       ListNode ans=new ListNode(0);
       ListNode vals=ans;
       for(int i=wow.size()-rot;i<wow.size();i++)
       {
        vals.next=new ListNode(wow.get(i));
        vals=vals.next;
       }
       for(int i=0;i<wow.size()-rot;i++)
       {
        vals.next=new ListNode(wow.get(i));
        vals=vals.next;
       }
       return ans.next;
    }
}