// check question in description 
//full code
import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold(Node head)
    {
     // Your code here
		Node dummy0 = new Node(0);
		Node dummy1 = new Node(1);
		Node first = dummy0;
		Node second = dummy1;

		int count = 1;
		while(head != null){
			if(count %2 == 1){
				first.next = head;
				first = first.next;
			}
			else{
				second.next = head;
				second = second.next;
			}
			count++;
			head = head.next;
		}
		second.next = null;
		// now reverse the second list;
		Node rev = reverse(dummy1.next);
		// concatinate the two dummy lists
		first.next = rev;
		
		print(dummy0.next);
		
    }
	static Node reverse(Node head){
		Node curr = head;
		Node prev = null;
		while(curr != null){
			Node next = curr.next; // saving the next node

			curr.next = prev; // pointing the next node to backwards (prev);

			// now moving the pointers
			prev = curr;
			curr = next;
		}
		return prev;
	}
	static void print(Node head){
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}
