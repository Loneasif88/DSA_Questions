//Question Link: 40<LeetCode> Combination Sum II
"https://leetcode.com/problems/combination-sum-ii/"
  

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list =  new ArrayList<>();
        helper(candidates, target, 0, 0, list, new ArrayList<Integer>());
        return list;
    }
    static void helper(int[] arr, int target, int sum, int ele, List<List<Integer>> list, List<Integer> ans){
        if(sum == target){
            list.add(new ArrayList<Integer>(ans));
            return;
        }
        else if(sum > target){
            return;
        }
        for( int i=ele; i<arr.length; i++){
            if(i > ele && arr[i]== arr[i-1]) continue; // this line will skip the duplicate elements
            ans.add(arr[i]);
            helper(arr, target, sum+arr[i],i+1, list, ans); // i+1 beacuse we want Each number in array may should be used only once in the combination.
            ans.remove(ans.size()-1);
        }
    }
}
