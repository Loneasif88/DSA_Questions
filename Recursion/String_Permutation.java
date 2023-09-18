

//Question available on GFG
// Question link:  
// https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1?page=1&company[]=Walmart&category[]=Recursion&sortBy=submissions


//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0)
            {
                String S = br.readLine().trim();
                Solution obj = new Solution();
                List<String> ans = obj.find_permutation(S);
                for( int i = 0; i < ans.size(); i++)
                {
                    out.print(ans.get(i)+" ");
                }
                out.println();
                            
            }
            out.close();
        }
    }
    
    
    // } Driver Code Ends
    
    
    class Solution {
        public List<String> find_permutation(String S) {
            // Code 
            Set<String> ans = new HashSet<>(); 
            // HashSet eleminated duplicate values;
            helper(S,"",ans);
            
            List<String> arr = new ArrayList<>(ans);
            //now we sorted these strings in asc order
            Collections.sort(arr);
            return arr;
        }
        // Helper Method
        public void helper(String s, String asf, Set<String> arr)
        {
            
            if(s.length() == 0){
                arr.add(asf);
                return;
            }
            
            for(int i=0; i<s.length(); i++){
                char toAdd = s.charAt(i);
                
                String leftPart = s.substring(0,i);
                String rightPart = s.substring(i+1,s.length());
                
                String roq = leftPart + rightPart;
                helper(roq, toAdd+asf,arr);
            }
        }
    }