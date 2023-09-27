//Question Link: 2095.<LeetCode> -Delete the Middle Node from the Linked List
"https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/"
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while(curr!=null){  // find the size of the node
            count++;
            curr = curr.next;
        }
        if(count == 1){  // if there are only one node in the list
            return null;
        }
        curr = head;
        for(int i=0; i<count/2-1; i++){  // running the loop till (mid-1)th node. 
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;

        }
}
