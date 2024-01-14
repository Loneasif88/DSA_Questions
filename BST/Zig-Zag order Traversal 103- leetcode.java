// leetcode - 103
// recursive approach
class Solution {
    public void helper(TreeNode root, List<List<Integer>> list, int level){
        if(root == null)
            return;
        if(level >= list.size()){
            List<Integer> newLevel = new ArrayList<>();
            list.add(newLevel);
        }
        if(level % 2 == 0){
            list.get(level).add(root.val);
        }
        else
            list.get(level).add(0,root.val);
        helper(root.left, list, level + 1);
        helper(root.right, list, level + 1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    helper(root, list,0);
    return list; 
    }
}
