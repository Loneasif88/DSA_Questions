//Question Link :  142<leetcode> -Linked List cycle II
"https://leetcode.com/problems/linked-list-cycle-ii/"

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
    public ListNode detectCycle(ListNode head) {
        ListNode sp =  head;
        ListNode fp = head;
        boolean isPresent = false;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp){
                isPresent = true;
                break;
            }
        }
        if(isPresent){
            ListNode start = head;
            while(start != sp){
                start = start.next;
                sp = sp.next;
            }
            return start;
        }
        return null;
    }
}
