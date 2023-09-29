//For Question check Description

//Solution only
class Solution {
	public  int compare(Node list1, Node list2){
		//write code here
		Node l1 = list1;
		Node l2 = list2;
		while(l1 != null && l2 != null){
			if(l1.data != l2.data){
				return 0;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		if(l1 != null || l2 != null){ // this means one list is larger than other
			return 0;
		}
		return 1;   // return 1 means both the lists are equal
	}
}
