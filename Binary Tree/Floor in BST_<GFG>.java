//Question Link: https://practice.geeksforgeeks.org/problems/floor-in-bst/1

// User function Template for Java

class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int ans = -1;
        while(root != null){
            if(root.data == x){
                ans = root.data;
                break;
            }
            else if(root.data > x){
                root = root.left;
            }
            else{
                ans = root.data;
                root = root.right;
            }
        }
        return ans;
    }
}
