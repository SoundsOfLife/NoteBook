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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        List<List<TreeNode>> nodes = new ArrayList<>();
        if (root != null) {
            List<TreeNode> init = new ArrayList<>();
            init.add(root);
            nodes.add(init);
            while (init.size() != 0) {
                List<TreeNode> temp = new ArrayList<>();
                for (int i = 0; i < init.size(); i++) {
                    if (init.get(i).left != null)
                        temp.add(init.get(i).left);
                    if (init.get(i).right != null)
                        temp.add(init.get(i).right);
                }
                if (temp.size() != 0)
                    nodes.add(temp);
                init = temp;
            }

            for (int i = 0; i < nodes.size(); i++) {
                List<TreeNode> temp = nodes.get(i);
                long sum = 0;
                for (int j = 0; j < temp.size(); j++)
                    sum += temp.get(j).val;
                ans.add(sum * 1.0 / temp.size());
            }
        }
        return ans;
    }
}