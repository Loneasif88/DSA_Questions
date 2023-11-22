// Question Link : https://leetcode.com/problems/search-a-2d-matrix/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m-1;

        //Stair Case Algoritms
        while(row < n && col >= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target > matrix[row][col])
                row++;
            else
                col--;
        }
        return false;
    }
}
