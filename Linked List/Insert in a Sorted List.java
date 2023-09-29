//Check description for Question

//Solution Only
class Solution {

    Node solve(Node head, int key) {
        // Add your code here.
		Node curr = head;
		Node newNode = new Node(key);
		if(key < head.data){
			newNode.next = head;
			return newNode;
		}
		while(curr != null){
			if(key <= curr.next.data){
				newNode.next = curr.next;
				curr.next = newNode;
				break;
			}
			curr = curr.next;
		}
		return head; 
  }
}
