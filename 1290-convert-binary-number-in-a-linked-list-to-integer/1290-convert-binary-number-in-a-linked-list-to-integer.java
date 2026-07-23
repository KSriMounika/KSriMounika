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
    public int getDecimalValue(ListNode head) {

        int nodes = 0;
        ListNode temp = head;
        while (temp != null)
        {
            temp = temp.next;
            nodes ++;
            
        }
        nodes --;
        temp = head;
        int s=0;
        while(temp != null)
        {
            s += temp.val * Math.pow(2, nodes);
            nodes--;
            temp = temp.next;

        }
        return s;

        
    }
}