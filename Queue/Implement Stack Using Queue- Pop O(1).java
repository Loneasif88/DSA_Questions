import java.io.*;
import java.util.*;
class Stack
{
	Queue<Integer> main = new LinkedList<>();
	Queue<Integer> helper = new LinkedList<>();
    void push(int a)
    {
        // your code here
		while(!main.isEmpty()){
			helper.add(main.peek());
			main.remove();
		}
		main.add(a);
		while(!helper.isEmpty()){
			main.add(helper.peek());
			helper.remove();
		}
    }
    
    int pop()
    {
        // your code here
		if(!main.isEmpty()){
			return main.remove();
		}
		else
			return -1;
    }	
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);    
        Stack g = new Stack();			
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1){
                int a = sc.nextInt();
                    // call push function here
				g.push(a);
            }
            else if(QueryType == 2){
                    // call pop function here
				System.out.print(g.pop()+" ");
            }
            q--;
        }	
    }
}
