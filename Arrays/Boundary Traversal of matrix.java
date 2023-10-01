// Question GFG -Boundary Traversal of a matrix. 
"https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1"
  
//User function Template for Java
class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean firstArrow = false;
        for(int i=0; i<m; i++){
            firstArrow = true;
            ans.add(matrix[0][i]);
        }
        if(firstArrow == true){
            boolean secondArrow = false;
            for(int i=1; i<n; i++){
                secondArrow = true;
                ans.add(matrix[i][m-1]);
            }
            if(secondArrow == true){
                boolean thirdArrow = false;
                for(int i=m-2; i>=0; i--){
                    thirdArrow = true;
                    ans.add(matrix[n-1][i]);
                }
                if(thirdArrow == true){
                    for(int i=n-2; i>0; i--){
                        ans.add(matrix[i][0]);
                    }
                }
            }
        }
        return ans;
    }
}
