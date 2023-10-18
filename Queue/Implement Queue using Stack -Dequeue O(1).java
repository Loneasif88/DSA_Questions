import java.io.*;
import java.util.*;

class StackQueue
{
	Stack<Integer> main = new Stack<>();
	Stack<Integer> helper = new Stack<>();
    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   //Write your code here
		while(main.size() != 0){
			int top = main.pop();
			helper.push(top);
		}
		main.push(x);
	  while(helper.size() != 0){
		  int top  = helper.pop();
		  main.push(top);
	  }
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
		if(main.size() == 0){
			return -1;
		}
		return main.pop();
	   //Write your code here
	    
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);  
        StackQueue s = new StackQueue();	
        int q = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                s.Push(a);
            }
            else if(QueryType == 2)
            ans.add(s.Pop());
        q--;
        }	
        for(int x:ans)
        System.out.print(x+" ");       
     System.out.println();
    }
}
