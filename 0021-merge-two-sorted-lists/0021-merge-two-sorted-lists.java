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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      List<Integer>wow=new ArrayList<>();
      while(list1!=null)
      {
        wow.add(list1.val);
        list1=list1.next;
      }
      while(list2!=null)
      {
        wow.add(list2.val);
        list2=list2.next;
      }
        Collections.sort(wow);
       ListNode head = new ListNode(0);
       ListNode temp = head;
     for(int i:wow)
     {
        temp.next=new ListNode(i);
        temp=temp.next;
     }
     return head.next;
    }
}