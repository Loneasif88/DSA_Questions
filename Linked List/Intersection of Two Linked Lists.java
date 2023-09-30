// Intersecting Node among two linked list
// check description for question.
// Solution only
static Node intersectingNode(Node headA, Node headB)
{
	//write code here
	Node curr = headA;
	Node curr1 =  headB;
	while(curr.next != null){
		curr = curr.next;
	}
	curr.next = curr1;        // creating cycle by connecting last node of first list with first node of second list
	return detectLoop(headA);  // now this function will detect the loop (intersecting point)
}

static Node detectLoop(Node head){
	Node sp = head;
	Node fp = head;
	while(fp != null && fp.next != null){
		fp = fp.next.next;
		sp = sp.next;
		if(fp == sp){
			break;
		}
	}
	Node start = head;
	while(start != sp){
		start = start.next;
		sp = sp.next;
	}
	return start;
}
