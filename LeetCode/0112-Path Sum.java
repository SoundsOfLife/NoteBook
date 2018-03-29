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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        return solve(root, 0, sum);
    }

    public boolean solve(TreeNode root, int sum, int target) {
        if (root.left == null && root.right == null) {
            return sum + root.val == target;
        } else {
            boolean ans = false;
            if (root.left != null && root.right != null)
                ans = ans || solve(root.right, sum + root.val, target) || solve(root.left, sum + root.val, target);
            else if (root.left == null)
                ans = ans || solve(root.right, sum + root.val, target);
            else
                ans = ans || solve(root.left, sum + root.val, target);
            return ans;
        }
    }
}