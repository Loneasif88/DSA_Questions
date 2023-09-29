//Question Link: 141<leetcode> -Linked List Cycle
"https://leetcode.com/problems/linked-list-cycle/description/"

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp){
                return true;
            }
        }
        return false;
        
    }
}
