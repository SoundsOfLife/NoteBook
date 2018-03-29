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
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(Math.max(longestUnivaluePath(root.left), longestUnivaluePath(root.right)), solve(root.left, root.val) + solve(root.right, root.val));
        }
    }

    public int solve(TreeNode root, int value) {
        if (root == null) {
            return 0;
        } else {
            if (root.val != value) {
                return 0;
            } else {
                return Math.max(solve(root.left, value), solve(root.right, value)) + 1;
            }
        }
    }
}