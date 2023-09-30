//Question Link: 328<leetcode> -Odd Even Linked List
"https://leetcode.com/problems/odd-even-linked-list/description/"

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
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        ListNode odd = d1;
        ListNode even = d2;
        int count = 1;
        while(head != null){
            if(count %2 == 1){
                odd.next = head;
                odd = odd.next;
            }
            else{
                even.next = head;
                even = even.next;
            }
            head = head.next;
            count++;
        }
        odd.next = d2.next;
        even.next = null;
        return d1.next;
    }
}
