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
    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        int nodes =0;
        while(temp != null)
        {
            nodes++;
            temp = temp.next;
        }
        int res = nodes/2;
        temp = head;
        for(int i=0; i<res; i++)
        {
           
            temp = temp.next;
           
        }
        return temp;
    }
}