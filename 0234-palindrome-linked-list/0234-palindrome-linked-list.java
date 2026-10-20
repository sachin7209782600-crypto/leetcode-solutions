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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        int [] wow=new int[count];
        int c=0;
        while(head!=null)
        {
         wow[c]=head.val;
         c++;
         head=head.next;
        }
        int first=0,last=wow.length-1;
        while(first<last)
        {
            if(wow[first]!=wow[last])
            {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}