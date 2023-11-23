/*
169. Majority Element
https://leetcode.com/problems/majority-element/
*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int maxFreq = -1;
        int value = nums[0];
        for(int i = 0; i<nums.length; i++){
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
            int currentFreq = hmap.get(nums[i]);
            if(currentFreq > maxFreq){
                value = nums[i];
                maxFreq = currentFreq;
            }
        }
        return value;
    }
}
