//Question Link: 216<LeetCode> Combination Sum III
"https://leetcode.com/problems/combination-sum-iii/"
  //Recursion and Backtracking

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        helper(k,n,9,0,1,list,new ArrayList<Integer>());
        return list;
    }
    static void helper(int k, int target, int n, int sum,int ele,List<List<Integer>> list, List<Integer> ans){
        if(ans.size() == k && sum == target){
            list.add(new ArrayList<>(ans));
            return;
        }
        else if(sum > target || ans.size() > k){
            return;
        }
        for( int i=ele; i<=n; i++){
            ans.add(i);
            helper(k,target,n,sum+i, i+1,list,ans);
            ans.remove(ans.size()-1);
        }
    }
}
