// for Question check description.

//Solution only
class Solution {
    public static Node detectLoop(Node head){
        //write code here
		Node sp = head;
		Node fp = head;
		boolean isPresent = false;
		// check if fast pointer reachs to null or not
		while(fp != null && fp.next != null){
			fp = fp.next.next;      // move fast pointer at double 2x speed
			sp = sp.next;           // move slow pointer at 1x speed
			if(fp == sp){            // if fast pointer equals to slow pointer then cycle is present and we have to stop the loop
				isPresent = true;
				break;
			}
		}
		Node start = head;      // create another pointer which points to start
		if(isPresent){          // if cycle is present 
			while(start != sp){      // while loop will move start and slow pointer one step till both reaches at the same node
				start = start.next;
				sp = sp.next;
			}
			return start;            // return the intersection node where cycle begins
		}
		else{
			return null;
		}
    }
}
