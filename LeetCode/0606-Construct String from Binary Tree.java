/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        } else {
            StringBuffer sb = new StringBuffer();
            sb.append(String.valueOf(t.val));
            if (t.left == null && t.right == null) {
            } else if (t.left != null && t.right == null) {
                sb.append("(" + tree2str(t.left) + ")");
            } else if (t.left == null && t.right != null) {
                sb.append("(" + tree2str(t.left) + ")");
                sb.append("(" + tree2str(t.right) + ")");
            } else {
                sb.append("(" + tree2str(t.left) + ")");
                sb.append("(" + tree2str(t.right) + ")");
            }
            return sb.toString();
        }
    }
}