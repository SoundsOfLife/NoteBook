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
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        } else {
            return pathSum(root.left, sum) + pathSum(root.right, sum) + solve(root, sum);
        }
    }


    public int solve(TreeNode root, int sum) {
        if (root != null) {
            if (root.val == sum)
                return 1 + solve(root.left, sum - root.val) + solve(root.right, sum - root.val);
            else
                return solve(root.left, sum - root.val) + solve(root.right, sum - root.val);
        } else {
            return 0;
        }
    }
}