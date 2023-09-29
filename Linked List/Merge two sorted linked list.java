// For question check description

//Solution only
class Solution {
 static Node merge(Node x, Node y){
	 Node dummy = new Node(0);
	 Node merge = dummy;

	 while(x != null && y != null){
		 if(x.data <= y.data){
			 merge.next = x;
			 x = x.next;
		 }
		 else{
			 merge.next = y;
			 y = y.next;
		 }
		 merge = merge.next;
	 }
	 if(x != null){
		 merge.next = x;
	 }
	 if(y != null){
		 merge.next = y;
	 }
	 return dummy.next;
    }
}
