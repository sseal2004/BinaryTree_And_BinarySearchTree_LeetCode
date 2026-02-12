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
    public int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        
        if(root==null)return null;
        // reverse inorder problem
        convertBST(root.right);//go to right subtree
        root.val+=sum; // root.val + sum of right sub tree
        sum = root.val;// update sum
        convertBST(root.left);
        return root;

    }
    
}