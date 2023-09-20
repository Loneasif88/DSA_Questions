//Question link:
"https://course.acciojob.com/idle?question=117d315f-d2e8-4eb8-9e68-bd2322a59f84"

// for question check description of this.


import java.io.*;
import java.util.*;

class Solution{
     public static void generateParanthesis(int n){
        // write code here
		 ArrayList<String> ans = new ArrayList<>();
		 helper(0,0,n,"",ans); // calling helper method

		 for(String s : ans){ // printing
			 System.out.println(s);
		 }
		 
    }
  //helper method
	public static void helper(int open, int close, int max, String p, ArrayList<String> ans){
		if(p.length() == max*2){
			ans.add(p);
			return;
		}

		if(open < max){
			helper(open+1,close,max,p+"(",ans);
		}
		if(close < open){
			helper(open,close+1,max,p+")",ans);
		}
	}
}
public class Main {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        Solution obj=new Solution();
        obj.generateParanthesis(n);
    }
}
