// for Question check description
// Solution only
class Solution
{
    public static boolean detectLoop(Node head){
		Node sp = head;
		Node fp = head;

		while(fp != null && fp.next != null){
			fp = fp.next.next;  // move two steps
			sp = sp.next;        // move one step
			if(fp == sp){        // if sp and fp meets at any node that means cycle is present
				return true;
			}
		}
		return false;     // cycle is not present
    }
}
