// check questin description

// full code
import java.util.*;

class Solution {
	public static Node getMid(Node head){
		Node sp = head;
		Node fp = head;
		while(fp.next != null && fp.next.next != null){
			fp = fp.next.next;
			sp = sp.next;
		}
		return sp;
	}
	public static Node mergeTwoSortedLL(Node head1, Node head2){
		Node temp1 = head1;
		Node temp2 = head2;
		Node dummy = new Node(0);
		Node temp = dummy;
		while(temp1 != null && temp2 != null){
			if(temp1.data <= temp2.data){
				temp.next = temp1;
				temp1 = temp1.next;
			}
			else{
				temp.next = temp2;
				temp2 = temp2.next;
			}
			temp = temp.next;
		}
		if(temp1 != null){
			temp.next = temp1;
		}
		if(temp2 != null){
			temp.next = temp2;
		}
		return dummy.next;
	}
    public static Node mergesort(Node head){
        //Write your code here
		// base case will be if there remains only one node 
		if(head.next == null){
			return head;
		}
		Node mid = getMid(head);
		Node temp1 = head;
		Node temp2 = mid.next;
		mid.next = null;
		// call recursively for left part and right part
		Node left = mergesort(temp1);
		Node right = mergesort(temp2);
		Node sortedLL = mergeTwoSortedLL(left,right);
		return sortedLL;
    }
}


class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
