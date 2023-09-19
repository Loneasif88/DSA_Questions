// Question Link : https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&category[]=Recursion&sortBy=submissions

//User function Template for Java

class Solution
{ 
  public void printNos(int N)
    {
        //Your code here
        if(N==0){  // base case (where we want to stop)
            return;
        }
        printNos(N-1);  // recursive call
        System.out.print(N+" ");
    }
}

