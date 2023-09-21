//Question Link: GFG
"https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1"

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        // Using DP
        // create an DP array of size n
        int[] dp = new int[n];
        
        // set value of 
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        
        // now start loop from i=2
        for( int i=2; i<n; i++){
            // now we have two choices
            //1. skip the current house and loot from previous house dp[i-1]
            //2. loot from current house and previous second house from dp array
            // and find the max of those
            dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i]);
        }
        // return dp[n-1]  last dp array element conatins the max loot
        return dp[n-1];
        
    }
}
