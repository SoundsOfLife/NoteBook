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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            if (root.left == null && root.right == null) {
                return 1;
            } else if (root.left != null && root.right == null) {
                return 1 + minDepth(root.left);
            } else if (root.left == null && root.right != null) {
                return 1 + minDepth(root.right);
            } else {
                return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
            }
        }

    }
}