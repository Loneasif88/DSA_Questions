//Question LInk:
"https://practice.geeksforgeeks.org/problems/find-first-set-bit-1587115620/1"

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
