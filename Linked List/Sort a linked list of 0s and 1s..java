//For Question check description

//Solution only
class Solution {
    static LinkedListNode sort01(LinkedListNode head){
        // Write your code here
		LinkedListNode curr = head;
		LinkedListNode dummy0 = new LinkedListNode(-1);
		LinkedListNode p0 = dummy0;//new Node();
		LinkedListNode dummy1 = new LinkedListNode(-1);
		LinkedListNode p1 = dummy1;
		while(curr != null){
			if(curr.data == 0){
				p0.next = curr;
				p0 = p0.next;
			}
			else{
				p1.next = curr;
				p1 = p1.next;
			}
			curr = curr.next;
		}
		p0.next = dummy1.next;
		p1.next = null;
		
		return dummy0.next;
    }
}
