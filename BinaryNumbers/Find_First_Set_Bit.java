//Question LInk:
 
"https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1"

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int index = 0;
        int j = 1;
        String binaryRep = Integer.toBinaryString(n);  // this will convert the integer n into binaryString.
        
        //for loop for iterating from right end
        for(int i=binaryRep.length()-1; i>=0; i--){
            if(binaryRep.charAt(i) == '1'){
               index = j;
                break;
            }
            j++;
        }
        return index;
    }
}
