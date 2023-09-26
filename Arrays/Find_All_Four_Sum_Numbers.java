//Question Link: POTD 
//Find All Four Sum Numbers
"https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1"

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        
        Arrays.sort(arr);
        int n = arr.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();  // using set because i dont want duplicates
        for(int i=0; i<n-3; i++)
        {
            for(int j=i+1; j<n-2; j++){
                int left = j+1;
                int right = n-1;
               
                while(left < right){
                    int sum = arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum == k){
                        ArrayList<Integer> ans = new ArrayList<>();
                        ans.add(arr[i]);
                        ans.add(arr[j]);
                        ans.add(arr[left]);
                        ans.add(arr[right]);
                        if(set.add(ans)){    /// this will avoid duplicates
                            list.add(ans);
                        }
                    left++;
                    right--;
                    }
                    else if(sum < k){
                        left++;
                    }
                    else{
                        right--;
                    }
                   
                }
            }
        }
        return list;
    }
}
