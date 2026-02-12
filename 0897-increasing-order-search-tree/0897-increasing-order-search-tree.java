/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode curr = new TreeNode(0);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = curr;
        inorder(root);
        return ans.right;
    }
    public void inorder(TreeNode root){
        if(root==null)return ;
        inorder(root.left);
        root.left=null;//declare
        curr.right = root;// 0 -> 1(right)
        curr= root;//update
        inorder(root.right);
    }
}