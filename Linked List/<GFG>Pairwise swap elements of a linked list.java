//GFG Question -Pairwise swap elements of a linked list
//Link: "https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1"

/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/


class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;
        
        while(curr.next != null && curr.next.next != null){
            Node first = curr.next;
            Node second = curr.next.next;
            
            //swap the connections
            first.next = second.next; // first will connect with third
            second.next = first;    // second next will connect with first
            curr.next = second;    // curr will connect with second
            // move pointer
            curr = first;
        }
        return dummy.next;
    }
}
