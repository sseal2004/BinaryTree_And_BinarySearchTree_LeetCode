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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null)return null;
        //case 2
        // atfirst root is 3 goes to 0 and 4
        //0 less than 1(low) ? yes go to right to 2
        else if(root.val < low) return trimBST(root.right,low,high);
        //4 is higher than 3 ? yes go to left that is null
        else if(root.val>high) return trimBST(root.left,low,high);
        //1
        root.left = trimBST(root.left,low,high);
        //2
        root.right = trimBST(root.right,low,high);
        // so 1<low and 2<high satisfied
        return root;


    }
}