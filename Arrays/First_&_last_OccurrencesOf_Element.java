//Question Link: GFG
"https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1"
  
// Time Complexity = O(log n);
class GFG
{
    
     ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int first = firstOccIndex( arr,  n, x);
        int last = lastOccIndex( arr,  n, x);
        
        ans.add(first);
        ans.add(last);
        return ans;
        
    }
    static int firstOccIndex(int[] arr, int n, int x){
        int low = 0, high = n-1;
        int first = -1;
        
        // while Loop 
        while(low <= high){
            int mid = low+ (high-low)/2;
            
            // three options here
            // 1. if mid ele == x then first =mid and high will be mid -1;
            if(arr[mid] == x){
                first = mid;
                high = mid-1;
            }
            // 2. if mid ele < x then we need to update low = mid+1;
            else if(arr[mid] < x){
                low = mid + 1;
            }
            // 3. if mid ele > x then we need to update high = mid-1;
            else {
                high = mid -1;
            }
        }
        return first;
    }
    static int lastOccIndex(int[] arr, int n, int x){
        int low =0, high = n-1;
        int last = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return last;
    }
}
