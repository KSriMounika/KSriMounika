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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
       
        ListNode curr = head.next;
        while(curr != null )
        {
            ListNode temp2 = head;
            while(temp2 != curr) 
            {
                if( temp2.val > curr.val )
                {
                
                 int temp = curr.val;
                 curr.val = temp2.val;
                 temp2.val = temp;
                }
                temp2 = temp2.next;
            }
            curr = curr.next;
        }
        return head ;
        
    }
}