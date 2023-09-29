// check description for question

//Soultion only
class Solution {
    static void unfold(Node head)
    {
     // Your code here
		Node dummy0 = new Node(-1);
		Node dummy1 = new Node(-1);
		Node dummy2 = new Node(-1);
		Node p0 = dummy0;
		Node p1 = dummy1;
		Node p2 = dummy2;

		while(head != null){
			if(head.data == 0){
				p0.next = head;
				p0 = p0.next;
			}
			else if(head.data == 1){
				p1.next = head;
				p1 = p1.next;
			}
			else{
				p2.next = head;
				p2 = p2.next;
			}
			head = head.next;
		}
		p0.next = dummy1.next;
		p1.next = dummy2.next;
		p2.next = null;
		
		print(dummy0.next);
    }
	static void print(Node curr){
		while(curr!= null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
	}
}
