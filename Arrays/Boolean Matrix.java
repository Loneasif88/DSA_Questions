// Question Link : Boolean Matrix 
https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 1){
                    makeMatrix(arr,i,j,n,m);
                }
            }
        }
        
        //Copy the arr[][] elements into the matrix[][]
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
    void makeMatrix(int arr[][],int row, int col,int n,int m){
        for(int i=0; i<n; i++){
            arr[i][col] = 1;
        }
        for(int j=0; j<m; j++){
            arr[row][j] = 1;
        }
    }
}
