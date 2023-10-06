// GFG question link
"https://practice.geeksforgeeks.org/problems/given-a-linked-list-reverse-alternate-nodes-and-append-at-the-end/1"

/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void rearrange(Node odd)
    {
        // add your code here
        Node temp = odd.next;
        Node newhead = temp;
        Node curr = odd;
        while(newhead != null && newhead.next != null){
        curr.next = newhead.next;
        curr = curr.next;
          
        newhead.next = curr.next;
        newhead = newhead.next;
        }
        Node revHead = reverse(temp);
        if(curr != null)
            curr.next = revHead;
    }
}
