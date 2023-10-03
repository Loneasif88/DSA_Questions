
// Solution only
class Solution{
    public static int countNodesinLoop(Node head)
    {
        //Write your code here.
        Node sp = head;
		Node fp = head;
		while(fp != null && fp.next != null){
			  fp = fp.next.next;
			  sp = sp.next;
			if(fp == sp){
				break;
			}
		}
		if(fp == null || fp.next == null){
			return 0;
		}
		Node start = head;
		
		while(start != sp){
			sp = sp.next;
			start = start.next;
		}
		// now sp will be at stating of the loop
		sp = sp.next;
		int count = 1;
		while(sp != start){
			sp = sp.next;
			count++;
		}
		return count;
    }
}
