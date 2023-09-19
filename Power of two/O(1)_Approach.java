//Question LInk: 
"https://practice.geeksforgeeks.org/problems/power-of-2-1587115620/1"

//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
         //This one line code has a time complexity of O(1);
    return (n > 0) && ((n & (n - 1)) == 0);
        
    }
    
}
/*
 * Explaination: 
 * In binary representation, powers of 2 have only one bit set to 1, and all other bits are 0. For example:

        2 is represented as 10 in binary.
        4 is represented as 100 in binary.
        8 is represented as 1000 in binary.
        
    To check if a number n is a power of 2, you can use the following observation:

    In binary representation, n will have exactly one bit set to 1 if it's a power of 2.
    If you subtract 1 from a power of 2, all bits to the right of the original 1 bit become 1. 
    For example, if you subtract 1 from 8 (1000), you get 7 (0111).
    So, if n is a power of 2, it will have the form 10...0 in binary, 
    and n - 1 will have the form 01...1. When you perform a bitwise AND operation 
    between n and n - 1, all the bits will cancel out except the leftmost 1 bit, which remains set. 
    This means that (n & (n - 1)) will be equal to 0 if n is a power of 2
 */
