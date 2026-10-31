/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        ListNode curr = node;
        if(curr.val == node.val)
        {
              curr.val = curr.next.val;
              curr.next = curr.next.next;
              curr = curr.next;
        }
           
        
        
    }
}