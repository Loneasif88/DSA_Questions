// 92<leetcode> -Reverse Linked List \
// Question link: https://leetcode.com/problems/reverse-linked-list-ii/?envType=study-plan-v2&envId=top-interview-150
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
    public ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start = head;
        ListNode end = head;
        ListNode prevStart = null;

        for(int i=0; i<left-1; i++){
            prevStart = start;
            start = start.next;
        }
        for(int i=0; i<right-1; i++){
            end = end.next;
        }
        ListNode lastpart = end.next;
        end.next = null;

        ListNode rev = reverseLL(start);
        if(prevStart != null)
            prevStart.next = rev;
        else 
            head = rev;
        start.next = lastpart;
        return head;

    }

}
