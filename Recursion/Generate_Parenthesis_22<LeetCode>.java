//Question Link: 22<LeetCode> Generate Parenthesis
"https://leetcode.com/problems/generate-parentheses/"
  
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(n,0,0,list,"");
        return list;
    }
    static void helper(int max, int open, int close, List<String> list, String ans){
        if(ans.length() == max*2){
            list.add(ans);
            return;
        }
        if(open < max){
            helper(max,open+1, close, list, ans+"(");
            //String openB = ans.substring(0,open);
        }
        if(close < open){
            helper(max, open, close+1, list, ans+")");
          // String closeB = ans.substring(0,close);
        }
    }
}
