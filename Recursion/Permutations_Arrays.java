//Question Link: #46. Permutations<leetCode>
"https://leetcode.com/problems/permutations/"

  class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list =  new ArrayList<>();
        //List<Integer> ans = new ArrayList<>();
        helper(nums,list,new ArrayList<>());
        return list;
    }
    public static void helper(int[] nums, List<List<Integer>> list, List<Integer> ans){
       if(ans.size() == nums.length){
           list.add(new ArrayList<>(ans));
           return;
       } 
       for(int i=0; i<nums.length; i++){
           if(ans.contains(nums[i])) continue;

           ans.add(nums[i]);
           helper(nums,list,ans);
           ans.remove(ans.size()-1);
        }
    }
}
