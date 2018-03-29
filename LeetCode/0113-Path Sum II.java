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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root != null) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root.left == null && root.right == null) {
                if (root.val == sum) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(root.val);
                    ans.add(temp);
                }
            } else if (root.left == null && root.right != null) {
                List<List<Integer>> right = pathSum(root.right, sum - root.val);
                for (List<Integer> e : right) {
                    e.add(0, root.val);
                }
                return right;
            } else if (root.left != null && root.right == null) {
                List<List<Integer>> left = pathSum(root.left, sum - root.val);
                for (List<Integer> e : left) {
                    e.add(0, root.val);
                }
                return left;
            } else {
                List<List<Integer>> right = pathSum(root.right, sum - root.val);
                List<List<Integer>> left = pathSum(root.left, sum - root.val);
                for (List<Integer> e : right) {
                    e.add(0, root.val);
                    ans.add(e);
                }
                for (List<Integer> e : left) {
                    e.add(0, root.val);
                    ans.add(e);
                }
                return ans;
            }
            return ans;
        } else {
            return new ArrayList<>();
        }
    }
}