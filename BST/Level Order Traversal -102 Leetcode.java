// leetcode - 102
// Recursive Approach
class Solution {
    public void helper(TreeNode root, List<List<Integer>> list, int level){
        if(root == null)
            return;
        if(level >= list.size()){
           List<Integer> newLevel = new ArrayList<Integer>();
            list.add(newLevel);
        }
        list.get(level).add(root.val);
        helper(root.left,list,level+1);
        helper(root.right,list,level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        helper(root,list,0);
        return list;
    }
}
