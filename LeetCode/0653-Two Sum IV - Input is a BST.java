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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        BST(root, list);
        int i = 0,j = list.size() - 1;
        boolean ans = false;
        while(i < j){
            if(list.get(i) + list.get(j) == k){
                ans = true;
                break;
            }else if(list.get(i) + list.get(j) > k){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }

    public void BST(TreeNode root,List<Integer> list){
        if(root != null){
            BST(root.left, list);
            list.add(root.val);
            BST(root.right, list);
        }
    }
}