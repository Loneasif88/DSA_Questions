// Question Link : 160<leetcode> -Intersection of two Linked List.
"https://leetcode.com/problems/intersection-of-two-linked-lists/"
  
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        
        while(h1.next != null){
            h1 = h1.next;
        }
        h1.next = h2;
        ListNode meet = detectLoop(headA);
        h1.next = null;   // setting back the last node to null because we dont want to change the original structure of linked list
        return meet;
    }
    public ListNode detectLoop(ListNode head){
        ListNode sp = head;
        ListNode fp = head;
        boolean flag = false;
        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
            if(sp == fp){
                flag = true;
                break;
            }
        }
        if(flag == true){
             sp = head;  // assign to start
            // now check when will sp and fp meet by moving one one step both
            while(sp != fp){
                sp = sp.next;
                fp = fp.next;
            }
            return sp;
        }
       return null; 
    }
}
