//<GFG> Question -Height of binary Tree
"https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1"

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node == null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left,right)+1;
    }
}
