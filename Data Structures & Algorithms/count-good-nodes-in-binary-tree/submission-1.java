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
    public int goodNodes(TreeNode root) {
        return countGoodNode(root, root.val);
    }
    int countGoodNode(TreeNode root,int maxRoot){
        if(root == null)    return 0;
        int i = 0;
        if(root.val >= maxRoot){
            i++;
            maxRoot = root.val;
        }
        return countGoodNode(root.left, maxRoot) + countGoodNode(root.right, maxRoot) + i;
    }
}
