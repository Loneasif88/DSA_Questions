//Question LInk: 
"https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1"

//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        //This commented code has a time complexity of O(Log N)
            boolean isPower = false;
            for(int i=0; i<=n/2; i++){
                int num = (int)Math.pow(2,i);
                //System.out.println(num);
                if(num == n){
                    isPower = true;
                    break;
                }
            }
         return isPower;
        
    }
    
}
