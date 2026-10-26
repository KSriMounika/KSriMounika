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
// class Solution {
//     public ListNode oddEvenList(ListNode head) {

        
//  Brute Force
//         if(head == null || head.next == null)
//         {
//             return head;
//         }
//         ListNode temp = head;
//         ArrayList<Integer> l = new ArrayList<>();

//         while(temp != null && temp.next != null)
//         {
//             l.add(temp.val);
//             temp = temp.next.next;
//         }
//         if(temp != null)
//         {
//             l.add(temp.val);
//         }
//         ListNode temp1 = head.next;
//         while(temp1 != null && temp1.next != null)
//         {
//             l.add(temp1.val);
//             temp1 = temp1.next.next;
//         }
//         if(temp1 != null)
//         {
//             l.add(temp1.val);
//         }
//         ListNode temp2 = head;
//         int i=0;
//         while(temp2 != null)
//         {
//             temp2.val = l.get(i);
//             i++;
//             temp2 = temp2.next;
//         }
//         return head;

//     }
// }
class Solution {
    public ListNode oddEvenList(ListNode head) {


        // Optimized
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = head.next;
        while(even != null && even.next != null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next ;
            even = even.next;

        }
        odd.next = evenhead;
        return head;

    }
}