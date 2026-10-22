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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        List<Integer>wow=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
             wow.add(temp.val);
             temp=temp.next;
            }
        }
        Collections.sort(wow);
        ListNode ans=new ListNode(0);
        ListNode er=ans;
        for(int i:wow)
        {
         er.next=new ListNode(i);
         er=er.next;
        }
        return ans.next;
    }
}