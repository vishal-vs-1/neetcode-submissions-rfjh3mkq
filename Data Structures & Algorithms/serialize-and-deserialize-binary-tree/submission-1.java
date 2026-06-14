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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    void dfs(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("N,");         
            return; 
        }
        sb.append(root.val).append(",");
        dfs(root.left, sb);
        dfs(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new ArrayDeque<>(Arrays.asList(data.split(",")));
        return dfsd(nodes);
    }

    TreeNode dfsd(Queue<String> nodes){
        String val = nodes.poll();
        if(val.equals("N"))  return null;
        TreeNode node = new TreeNode(Integer.valueOf(val));
        node.left = dfsd(nodes);
        node.right = dfsd(nodes);
        return node; 
    }


}
