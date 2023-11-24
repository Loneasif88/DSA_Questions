/*
189. Rotate Array -Leetcode
https://leetcode.com/problems/rotate-array/
*/

class Solution {
    public void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
   
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=n;
        // Rotate the entire array
        reverse(nums,0,n-1);

        / /Rotate the first k elements
        reverse(nums,0,k-1);

        // Rotate the remaining k elements
        reverse(nums,k,n-1);
    }
}
