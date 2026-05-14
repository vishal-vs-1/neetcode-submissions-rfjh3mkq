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
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return result; 
    }
    private int calculateHeight(TreeNode root){
        if(root == null)    return 0;
        int left = calculateHeight(root.left);
        int right = calculateHeight(root.right);
        result = Math.max(result, left + right); 
        return Math.max(left, right) + 1; 
    }
}
