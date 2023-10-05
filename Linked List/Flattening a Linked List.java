// Solution Only Contains 3 methods
//1. flatten() method
//2. MergeTwoSortedLL() method
//3. printList() method

static Node flatten(Node root) {
    // your code here
	  if(root == null || root.right == null){
		  return root;
	  }
	  Node merged = flatten(root.right);
	  Node newhead = MergeTwoSortedLL(merged,root);
	  newhead.right = null;
	  return newhead;
  }
static Node MergeTwoSortedLL(Node headA, Node headB){
	if(headA == null){
		return headB;
	}
	if(headB == null){
		return headB;
	}
	Node head = null;
	Node tail = null;
	while(headA != null && headB != null){
		if(headA.data <= headB.data){
			if(head == null){
				head = headA;
				tail = headA;
			}
			else{
				tail.down = headA;
				tail = tail.down;
			}
			headA = headA.down;
		}else{
			if(head == null){
				head = headB;
				tail = headB;
			}
			else{
				tail.down = headB;
				tail = tail.down;
			}
			headB = headB.down;
		}
	}
	if(headA != null){
		tail.down = headA;
	}
	if(headB != null){
		tail.down = headB;
	}
	return head;
}
static void printList(Node head) {
    // your code here
	while(head != null){
		System.out.print(head.data+" ");
		head = head.down;
	}
	System.out.println();
  }
