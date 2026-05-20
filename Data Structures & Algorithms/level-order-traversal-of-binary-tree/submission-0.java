/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        fillLevel(index, result, root);
        return result;
    }
    void fillLevel(int index, List<List<Integer>> result, TreeNode root){
        if(root == null)    return;
        if(result.size() == index)  result.add(new ArrayList<Integer>());
        result.get(index).add(root.val);
        fillLevel(index+1, result, root.left);
        fillLevel(index+1, result, root.right);

    }
}
