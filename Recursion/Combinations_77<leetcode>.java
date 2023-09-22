//Question Link: 77<leetcode> Combinations
"https://leetcode.com/problems/combinations/"

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list =  new ArrayList<>();
        helper(n,k,new ArrayList<>(),list,1);
        return list;
    }
    static void helper(int n, int k, List<Integer> ans, List<List<Integer>> list, int ele){
        if(ans.size() == k){
            list.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ele; i<=n; i++){
            //int ele = i;
            //if(ans.contains(ele)) continue;

            ans.add(i);
            helper(n,k,ans,list,i+1);
            ans.remove(ans.size()-1);
        }
    }
}
