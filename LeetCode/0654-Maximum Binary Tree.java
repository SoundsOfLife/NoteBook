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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(nums, 0, nums.length - 1);
    }

    public TreeNode solve(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        } else if (left == right) {
            return new TreeNode(nums[left]);
        } else {
            int index = left;
            for (int i = left; i <= right; i++) {
                if (nums[i] >= nums[index]) {
                    index = i;
                }
            }
            TreeNode ans = new TreeNode(nums[index]);
            ans.left = solve(nums, left, index - 1);
            ans.right = solve(nums, index + 1, right);
            return ans;
        }
    }
}