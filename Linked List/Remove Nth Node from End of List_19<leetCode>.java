//Question Link:  19 <LeetCode> -Remove Nth Node from End of List 
"https://leetcode.com/problems/remove-nth-node-from-end-of-list/"

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowP = head;
        ListNode fastP = head;
        for(int i=0; i<n; i++){
            fastP = fastP.next;
        }
        if(fastP == null){   // removing last node from list 
            head = head.next;
            return head;
        }
        while(fastP.next != null){    // for middle nodes
            fastP = fastP.next;
            slowP = slowP.next;
        }
        if(n == 1){  // removing ist node form end of list
            slowP.next = fastP.next;
            return head;
        }
        slowP.next = slowP.next.next;   // middle nodes

        return head;
    }
}
