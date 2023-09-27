//Question Link : 876 <leetcode> -Middle of the Linked List 
"https://leetcode.com/problems/middle-of-the-linked-list/"

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
        ListNode curr = head;
        int count = 0;
        while(curr!=null){  // find the size of the node
            count++;
            curr = curr.next;
        }
        curr = head;
        for(int i=0; i<count/2; i++){
            curr = curr.next;
        }
        return curr;
    }
}
