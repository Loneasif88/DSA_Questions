// Check description for question

//Soultion Only
class Accio
{
    static void checkListSorted(Node head)
    {
		Node curr = head;
		boolean isSorted = true;
		while(curr != null & curr.next != null){
			if(curr.data > curr.next .data){
				isSorted = false;
				break;
			}
			curr = curr.next;
		}
		if(isSorted)
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
    }
}
