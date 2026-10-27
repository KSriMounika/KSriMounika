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

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode temp = list1;
        ListNode temp1 = list2;
        if(list1 == null && list2 == null)
        {
            return list1;
        }
        if(list1 != null && list2 == null)
        {
            return list1;
        }
        if(list1 == null && list2 != null)
        {
            return list2;
        }
        while(temp != null && temp1 != null)
        {
           if(temp.val < temp1.val)
           {
             curr.next = temp;
             curr = curr.next;
             temp = temp.next;
           }
           else
           {
             curr.next = temp1;
             curr = curr.next;
             temp1 = temp1.next;
           }
          
          
        }
        if(temp != null)
        {
            curr.next = temp;
        }
        if(temp1 != null)
        {
            curr.next = temp1;
        }
        return dummy.next ;
        
    }
}