class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null){
            return null;
        }else if(root.val <= R && root.val >= L){
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        }else{
            if(root.val < L){
                return root.right == null?null:trimBST(root.right, L, R);
            }else{
                return root.left  == null?null:trimBST(root.left, L, R);
            }
        }
    }
}