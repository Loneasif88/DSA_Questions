/*
704. Binary Search<LeetCode>
https://leetcode.com/problems/binary-search/
*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            // find mid
            int mid = left + (right - left)/2;  //(left+right)/2;

            if(nums[mid] == target){
                return mid;
            }
            // if target is greater than mid element
            if(nums[mid] < target){
                left = mid+1;
            }
            else
                right = mid - 1;
        }
        return -1;
    }
}
