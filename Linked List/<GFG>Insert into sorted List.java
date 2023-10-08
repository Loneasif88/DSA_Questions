
"https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1"

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.'''
        Node curr = head1;
        Node newNode = new Node(key);
        if(key <= head1.data){
            newNode.next = head1;
            return newNode;
        }
        while(curr.next != null)
        {
            if(key <= curr.next.data){
                newNode.next = curr.next;
                curr.next = newNode;
                return head1;
            }
            curr = curr.next;
        }
        curr.next = newNode;
        return head1;
    }
}
