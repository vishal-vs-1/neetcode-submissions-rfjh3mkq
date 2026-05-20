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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        fillResult(root, result, 0);
        return result;
    }
    void fillResult(TreeNode root, List<Integer> result, int index){
        if(root == null)    return;
        if(result.size() == index)  result.add(0);
        result.set(index, root.val);
        fillResult(root.left, result, index +1);
        fillResult(root.right, result, index +1);
        return;
    }
}
