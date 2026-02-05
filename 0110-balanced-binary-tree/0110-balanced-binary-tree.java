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
    public boolean isBalanced(TreeNode root) {
                return height(root)!=-1;

    }
    static int height (TreeNode root){
        if(root == null )return 0;
        int leftSubTree  = height(root.left);
        if(leftSubTree == -1) return -1;
        int rightSubTree = height(root.right);
        if(rightSubTree == -1)return -1;

        if(Math.abs(leftSubTree-rightSubTree)>1)return -1;// abs means non negative or absolute value
        
        return 1+Math.max(leftSubTree, rightSubTree);
    }
}