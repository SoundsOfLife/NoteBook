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
    public List<Integer> largestValues(TreeNode root) {
        int height = getHeight(root);
        Integer[] ans = new Integer[height];
        for (int i = 0; i < height; i++) {
            ans[i] = Integer.MIN_VALUE;
        }
        solve(ans, root, 0);
        return Arrays.asList(ans);

    }

    public void solve(Integer[] ans, TreeNode root, int floor) {
        if (root != null) {
            if (root.val >= ans[floor]) {
                ans[floor] = root.val;
            }
            solve(ans, root.left, floor + 1);
            solve(ans, root.right, floor + 1);
        }
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
    }
}