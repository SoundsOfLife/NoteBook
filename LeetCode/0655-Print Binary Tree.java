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
    public List<List<String>> printTree(TreeNode root) {
        int m = getHeight(root);
        int n = 1;
        for (int i = 1; i < m; i++)
            n = n * 2 + 1;
        String[][] flag = new String[m][n];
        List<List<String>> ans = new ArrayList<>();
        sign(root, 0, 0, n - 1, flag);
        for (int i = 0; i < m; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if(flag[i][j] == null)
                    temp.add("");
                else
                    temp.add(flag[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }

    public void sign(TreeNode root, int floor, int left, int right, String[][] flag) {
        if (floor < flag.length) {
            if (root != null) {
                int mid = (left + right) / 2;
                flag[floor][mid] = String.valueOf(root.val);
                sign(root.left, floor + 1, left, mid - 1, flag);
                sign(root.right, floor + 1, mid + 1, right, flag);
            }
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