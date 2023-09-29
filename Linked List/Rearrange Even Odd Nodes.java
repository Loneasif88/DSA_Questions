//for Question check description

//Solution
class Solution {
    public Node rearrangeList(Node head) {
        //Write code here
		Node dummyE = new Node(-1);
		Node dummyO = new Node(-1);
		Node even = dummyE;
		Node odd = dummyO;

		while(head != null){
			if(head.val %2 == 0){
				even.next = head;
				even = even.next;
			}
			else{
				odd.next = head;
				odd = odd.next;
			}
			head = head.next;
		}
		even.next = dummyO.next;
		odd.next = null;
		
		return dummyE.next;
    }

}
