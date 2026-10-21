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
        int c1=0;
        int c2=0;
        ListNode list11=list1;
        ListNode list22=list2;
        while(list11!=null)
        {
        c1++;
        list11=list11.next;
        }
         while(list22!=null)
        {
        c2++;
        list22=list22.next;
        }
        int [] wow=new int[c1+c2];
        for(int i=0;i<c1;i++)
        {
            wow[i]=list1.val;
            list1=list1.next;
        }
         for(int i=c1;i<c1+c2;i++)
        {
            wow[i]=list2.val;
            list2=list2.next;
        }
        Arrays.sort(wow);
       ListNode head = new ListNode(0);
       ListNode temp = head;

         for (int i = 0; i < wow.length; i++) {
         temp.next = new ListNode(wow[i]);
         temp = temp.next;
}

return head.next;
        
    }
}