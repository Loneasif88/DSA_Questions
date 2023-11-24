// 1512<leetcode> -Number of good pairs
// Question Link: "https://leetcode.com/problems/number-of-good-pairs/?envType=daily-question&envId=2023-10-03"


/**
Brute Force:
Initialize a variable count to 0.
Use two nested loops to iterate through all possible pairs of indices (i, j) where i < j.
If nums[i] is equal to nums[j], increment the count by 1.
After both loops finish, return the count.

Complexity
⏱️ Time Complexity: O(n^2) - because of the nested loops.
🚀 Space Complexity: O(1) - no additional data structures are used.
**/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(i<j && nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
