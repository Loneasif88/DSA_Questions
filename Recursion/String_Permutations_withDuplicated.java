//Question Link:
"https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1?page=1&category[]=Recursion&sortBy=submissions"
//String permutation with duplicates

//User function Template for Java
class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        helper(S,"",ans);
        Collections.sort(ans);
        return ans;
    
    }
    public void helper(String S,String asf,ArrayList<String> ans){
        
        if(S.isEmpty()){
            ans.add(asf);
            return;
        }
        
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            
            String leftPart = S.substring(0,i);
            String rightPart = S.substring(i+1,S.length());
            
            String roq = leftPart + rightPart;
            helper(roq,ch+asf,ans);
        }
    }
	   
}
