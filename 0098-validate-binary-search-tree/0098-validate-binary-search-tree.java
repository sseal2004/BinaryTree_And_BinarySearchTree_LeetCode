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
    public boolean isValidBST(TreeNode root) {
        return range(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean range(TreeNode root, long minValue, long maxValue) {
        if (root == null) return true;

        if (root.val <= minValue || root.val >= maxValue) return false;

        return range(root.left, minValue, root.val)
            && range(root.right, root.val, maxValue);
    }
}
