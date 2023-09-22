//Question Link: 39<leetCode> Combination Sum
"https://leetcode.com/problems/combination-sum/"

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        //list.add(new ArrayList<Integer>());
        helper(candidates,target,0,0,list,new ArrayList<Integer>());
        return list;
    }
    static void helper(int[] candidates, int target, int sum,int start, List<List<Integer>> list, List<Integer> ans){
        if(sum == target){
            list.add(new ArrayList<>(ans));
            return;
        }
        else if(sum > target){
            return;
        }
        for(int i=start; i<candidates.length; i++){
            ans.add(candidates[i]);
            
            helper(candidates, target, sum+candidates[i],i, list, ans);
            ans.remove(ans.size()-1);
        }
        
    }
}
