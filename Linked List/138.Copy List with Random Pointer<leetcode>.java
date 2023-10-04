// Leetcode question 138<leetcode> -Copy List with Random Point
"https://leetcode.com/problems/copy-list-with-random-pointer/"
  
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // create new copied linked list
        if(head == null){
            return null;
        }
        Node curr = head;
        while(curr != null){
            Node copy = new Node(curr.val);
            Node next = curr.next;
            curr.next = copy;
            copy.next = next;
            curr = next;
        }
        curr = head;
        // joining random connections
        while(curr != null){
            Node copyNode = curr.next;
            if(curr.random != null)
                copyNode.random = curr.random.next;
            else
                copyNode.random = null;
            curr = curr.next.next;
        }
        curr = head;
        Node copiedHead = curr.next;
        // seperating copied and original
        while(curr != null){
            Node cn = curr.next;

            curr.next = cn.next;
            if(curr.next != null)
                cn.next = curr.next.next;
            else
                cn.next = null;
            curr = curr.next;
        }
        return copiedHead;
    }
}
